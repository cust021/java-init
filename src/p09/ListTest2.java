package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Integer> numList = new ArrayList<Integer>();
		Random r = new Random();

		while (numList.size() < 20) {
			int rNum = r.nextInt(100) + 1;
			if (numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}

		}
		for (int i = 0; i < numList.size(); i++) {
			int num = numList.get(i);
			int mod = num % 10;
			int quo = num / 10;
			if (mod == 3 || mod == 6 || mod == 9 || quo == 3 || quo == 6 || quo == 9) {
				if ((mod == 3 || mod == 6 || mod == 9) && (quo == 3 || quo == 6 || quo == 9)) {
					System.out.println(num + " : 짝짝");
				} else {
					System.out.println(num + " : 짝");
				}
			} else {
				System.err.println(num);
			}
			
		}System.err.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(int i =0; i<numList.size(); i++) {
			String numStr = numList.get(i).toString();   // String numStr로 지정후 toString()으로 초기화해준다
			numStr = numStr.replace("3", "짝");			 // 그 다음 지정된 numStr로 출력 값을 넣는다.  
			numStr = numStr.replace("6", "짝");
			numStr = numStr.replace("9", "짝");
			System.out.println(numList.get(i) + " : " + numStr);
		}
	}
}
