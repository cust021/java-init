package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		Random r = new Random();
		while(numList.size() < 20) {
			int rNum = r.nextInt(200) +1;
			if(rNum % 2 == 1 && numList.indexOf(rNum) == -1){ 	//홀 수 만 출력
				numList.add(rNum);
			}
		}
		System.out.println(numList);
	}	
}
