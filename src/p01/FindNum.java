package p01;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Random r = new Random();
		int rNum = r.nextInt(5) + 1;
		Scanner scan = new Scanner(System.in); //사용자로부터 키를 입력 받기 위해
		for(int i=1; i<=5; i++) {
			System.out.print("맞출 숫자를 입력 :" );
			String str = scan.nextLine();
			int num = Integer.parseInt(str);
			if(rNum==num) {
				System.out.println("맞췄다");
			}else {
				System.out.println("틀렸다");
			}
		}

	}

}
