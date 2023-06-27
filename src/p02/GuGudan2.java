package p02;

import java.util.Scanner;

public class GuGudan2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력 : ");
		String numStr = scan.nextLine();
		System.out.println("내가 입력한 숫자 : " + numStr);
		
		int num = Integer.parseInt(numStr);
		for(int i=1; i<=10; i++) {
			
			System.out.println(i + " x " + numStr + " = " + num * i);
		}
	}

}

