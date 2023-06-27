package p02;

import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] lotto = new int[6]; 						//로또 선언 
		for(int i=0; i<lotto.length; i++) {
			int rNum = r.nextInt(45)+1;
			lotto[i] = rNum;
		}
		
		
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto = " + lotto[i]);
			
		}

	}

}
