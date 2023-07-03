package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
		}
		System.out.println("1~45까지 숫자를 , 를 기준으로 6개 입력해주세요 :");
		Scanner scan = new Scanner(System.in); //시스템에 입력받고
		String lottoStr = scan.nextLine();     //입력 받은 시스템 값을 콘솔 출력
		String[] strs = lottoStr.split(",");
		int cnt = 0;
	
		for(int i = 0; i <strs.length; i++) {
			int rNum = Integer.parseInt(strs[i]);
			for(int j=0; j<lotto.length;j++) {
				//String lottoString = Integer.toString(lotto[i]);			//월요일 쪽지 시험예상
				//lottoString = String.valueOf(lotto[i]);

				if(lotto[i] == rNum) {
					cnt++;
				}
				}
			}
			
		for(int i =0; i<strs.length; i++) {
			System.out.println(cnt + "개를 맞추셨습니다.");
			
				
		}
	}
}

