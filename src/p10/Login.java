package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();

		String sql = "SELECT * FROM user_info ";
		sql += " WHERE UI_ID = '" + uiId + "'AND UI_PWD='" + uiPwd + "'";

		Connection con = DBCon.getCon(); // 데이터 베이스 연결
		try {
			Statement stmt = con.createStatement();

			String sql1 = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME)\r\n" + "VALUES('TEST33','TEST33','연습33')";
			int resultCnt = stmt.executeUpdate(sql1);		//생성 저장

			System.out.println("회원가입 완료!" + resultCnt);  //저장된 값을 확인 후 내용 출력
			ResultSet rs = stmt.executeQuery(sql);   		// 저장된 아이디를 출력
			String sql2 = "UPDATE user_info SET UI_Name ='히히', UI_PWD='헤헤' WHERE UI_NUM = 13;";  //기존 아이디 수정
			int resultCnt2 = stmt.executeUpdate(sql2);		//새로운 리설트 값 변수를 만들면서 수정된 아이디 를 저장
			if (rs.next()) {
				String uiName = rs.getString("UI_NAME");
				System.out.println(uiName + "님 안녕!");
			} else {
				System.out.println("아이디나 비밀번호가 잘못 되었습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
