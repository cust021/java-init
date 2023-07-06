package p09;

import java.util.ArrayList;
import java.util.List;

public class ForLoop {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("일");
		strList.add("이");
		strList.add("삼");
		strList.add("사");
		
		for(int i =0; i<strList.size(); i++) {
			String name = strList.get(i);			//기존의 알고 있던 for문
			System.out.println(name);
		}
		for(String name : strList) {				//향상된 for문(이걸 주로 쓸 예정)
			System.out.println(name);
		}
	}
}
