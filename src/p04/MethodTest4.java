package p04;

import java.util.Random;
import java.util.Scanner;

public class MethodTest4 {

	public static int[] getLotto() {  			//메서드()란 : 기능을 저장하기 위해서 사용함
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
		int rNum = MethodTest2.getRandomNum(45);
		
			for(int o=0; o<i; o++) 
			{
				if(lotto[o] == rNum) 
				{
					i--;
					break;
				}
			}
				if(lotto[i]==0)
				{
					lotto[i] = rNum;				//질문 1
				}
		}	
		return lotto;
	}
	public static void printLotto(int[] lotto) {
		for(int i=0; i<lotto.length;i++) {
			System.out.println("lotto[" + i + "] : " + lotto[i]);
		}
	}
	
	int a;
	 											//변수란 : 다양한 값을 저장하기 위해서 사용하는 수
												//상수란 : 고정된 값을 저장하기 위해서 사용함
	public static void main(String[] args) {
		int[] lotto = getLotto();
		printLotto(lotto);
		
		}
	}

