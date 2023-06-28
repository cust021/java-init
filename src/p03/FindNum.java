package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //console 창 문자 입력
		boolean correct = false;  //일단 true로 초기화
		Random random = new Random();
		int rNum = random.nextInt(10)+1;
		int i=1;
		while(!correct) {
			System.out.print("1부터 10까지 숫자 입력하세요 : ");
			int inputNum = Integer.parseInt(scan.nextLine()); //문자 값이 정수형으로 바뀌면서 -> 변환 값이 scan.nextLine() (console)에 입력 될 때 까지
			correct = rNum == inputNum;
			if(rNum != inputNum) {
				i++;
			}else {
			
				System.out.println(i+"번째 " + "와 맞췄다.");
			}
			
		}
		
	  
		
	}
}
		//System.out //출력
		//System.in  //입력
	
		
