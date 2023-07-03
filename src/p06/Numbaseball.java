package p06;

import java.util.Random;
import java.util.Scanner;

public class Numbaseball {
	public static void main(String[] args) {

		Random random = new Random();
		int[] nums = new int[3];	
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(10);
			for(int j = 0; j < i; j++) {
				if(nums[i] == nums[j]) {
					i--;
					break;
				}
			}		
		}
		nums = new int[] {5,0,1};
		Scanner scan = new Scanner(System.in);
		System.out.print("3개의 숫자를 입력해주세요 : ");
		String numStr = scan.nextLine();
		String[] numStrs =numStr.split(",");
		int[] compNums = new int[numStrs.length];
		for(int i =0 ; i<numStrs.length; i++) {
			compNums[i] = Integer.parseInt(numStrs[i]);
		}
	}
}
