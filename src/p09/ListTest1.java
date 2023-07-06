package p09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		Random r = new Random();

		while (numList.size() < 6) {
			int rNum = r.nextInt(100) + 1;
			if (numList.indexOf(rNum) == -1) {
				numList.add(rNum);
			}
		}
		System.out.println(numList);

		int max = numList.get(0);
		int min = numList.get(0);
		for (int i = 1; i < numList.size(); i++) {
			if (max < numList.get(i)) {
				max = numList.get(i);

			}
			if (min > numList.get(i)) {
				min = numList.get(i);

			}
		}
		System.out.println("max 값은 : " + max);
		System.out.println("min 값은 : " + min);

	}
}
