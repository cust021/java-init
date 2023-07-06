package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest4 {
	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개를 ,를 기준으로 입력해주세요 : ");
		String numStr = scan.nextLine();
		String[] numStrs = numStr.split(",");
		
		for(int i = 0; i < numStrs.length; i++) {
			int input = Integer.parseInt(numStrs[i]);
			
			numList.add(input);
		}
		
		System.out.println("숫자 3개를 ,를 기준으로 입력해주세요 : ");
		numStr = scan.nextLine();
		numStrs = numStr.split(",");
		int cnt = 0;
		for(int i=0; i<numStrs.length; i++) {
			int num = Integer.parseInt(numStrs[i]);
			for(int j =0; j< numList.size(); j++) {
				if(num==numList.get(j)) {
					cnt++;
				}
			}
		}
		System.out.println("맞춘 갯수 : " + cnt);
	}
}
