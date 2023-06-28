package p03;

import java.util.Random;

public class Lotto {
		public static void main(String[] args) {
			Random r = new Random();
			
			int[] lotto = new int[6];
			for(int i=0; i<lotto.length; i++) 
			{
				int Num = r.nextInt(6)+1;
				for(int o=0; o<i; o++) 
				{
					if(lotto[o] == Num) 
					{
						i--;
						break;
					}
				}
					if(lotto[i]==0)
					{
						lotto[i] = Num;				//질문 1
					}
			}
				
		
			for(int i=0; i<lotto.length; i++) {
				System.out.println("로또 번호 ["+ i +"]="  + lotto[i]);
			}
	}
}
