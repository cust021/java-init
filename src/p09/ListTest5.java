package p09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest5 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(1);
		numList.add(35);
		numList.add(17);
		numList.add(4);
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (numList.get(i) > numList.get(j)) {
					int tmp = numList.get(i);
					numList.set(i, numList.get(j));
					numList.set(j, tmp);
				}
			}
		}

		System.out.println(numList.get(0) + " " + numList.get(1) + " " + numList.get(2) + " " + numList.get(3) + " "
				+ numList.get(4));
		Collections.sort(numList);
		System.out.println(numList);
	}
}
