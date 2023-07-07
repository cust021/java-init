package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/kd","root","kd1824java");
			Statement stmt = con.createStatement();
			String sql = "UPDATE user_info SET UI_Name ='이야아', UI_PWD='호호' WHERE UI_NUM = 3;";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("반영된 행 갯수" +resultCnt);
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
	}
	
}
