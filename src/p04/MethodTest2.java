package p04;										// package는 즉 폴더라고 보면 됨 (개념차이)

import java.util.Random;


public class MethodTest2 {

	public static int getRandomNum(int max) {
		Random r = new Random();
		
		int rNum = r.nextInt(max); 					 //데이터 타입인 int형 메소드 타입이니 (45)+1 <-이 입력가능함
		rNum += 1;
		return rNum;
	}
	public static void main(String[] args) {
		java.lang.System.out.println(getRandomNum(50));  // System 앞에는 java.lang.이 포함(생략)되어 있음
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		System.out.println(getRandomNum(1));
		
		
	}
}
