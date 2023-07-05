package p08;

import java.util.ArrayList;

public class ListTest { //List에서 ArrayList 중요
	public static void main(String[] args) {

		String str1 = "안녕 ";
		String str2 = "내 소개를 ";
		String str3 = "하지. ";
		String str4 = "내 직업은 ";
		String str5 = "돈 많은 백수야";

		String[] strs = new String[5];
		strs[0] = str1;
		strs[1] = str2;
		strs[2] = str3;
		strs[3] = str4;
		strs[4] = str5;

		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		ArrayList<String> strList = new ArrayList<String>(); //무조건 0부터 시작 ArrayList 는 배열과 다르게 관객 수 지정을 안해도 된다 즉 지정을 안한다.  length 대신 size를 씀 
		System.out.println(strList.size());  // 0시작
		strList.add("1");					 // add+1
		System.out.println(strList.size());	 // 1
		strList.add("2");					 // add+2
		System.out.println(strList.size());	 // 2
		strList.add("개");					 // add+1
		System.out.println(strList.size());  // 3
		strList.remove(0);					 // remove -1
		System.out.println(strList.size());	 // 2            //관객 수를 지정안하여 늘어나거나 지워지는걸 바로 볼 수 있다.
		
		ArrayList<Integer> intList = new ArrayList<Integer>();  //Integer
		System.out.println(intList.size()); 
		intList.add(1);
		System.out.println(intList.size()); 
		intList.add(1);
		System.out.println(intList.size()); 
	}
}
