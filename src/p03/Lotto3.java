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
		Scanner scan = new Scanner(System.in);
		String lottoStr = scan.nextLine();
		String[] strs = lottoStr.split(",");
		int cnt = 0;
		for(int i = 0; i <strs.length; i++) {
			for(int j=0; j<lotto.length;j++) {
				if(lotto[i] == cnt) {
					i--;
					break;
				}
				}
			}
			
		for(int i =0; i<strs.length; i++) {
			System.out.println(strs[i]+i);
			
			
			
		
		}
	}
}

