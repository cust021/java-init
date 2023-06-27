package p01;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		
		int [] lotto = new int[3];
		for(int i=0; i<3; i++) {
			lotto[i] = r.nextInt(10)+1;
		}
		lotto[0] = r.nextInt(10)+1;
		lotto[1] = r.nextInt(10)+1;
		lotto[2] = r.nextInt(10)+1;
		
		System.out.println(lotto[0]);
		System.out.println(lotto[1]);
		System.out.println(lotto[2]);
		
		
		

				
		
		

	}

}
