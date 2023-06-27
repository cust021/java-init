package p02;

public class Arraytest3 {

	public static void main(String[] args) {
		String[] strs = new String[10];  	//new는 메모리를 새로 만들어줌 int 배열시 new 배열 값엔 값이 항상 존재
		
		/*
		 * 0 ->10
		 * 1-> 9
		 * 2-> 8
		 * 3-> 7
		 * ....
		 * 9-> 1
		 */
		/*for(int i=0; i<10; i++) {
			strs[i]=Integer.toString(i+10);
			System.out.println( i+ " -> " + strs[i]);
			
		}*/
		
		for(int i=0;i<10;i++) {
			strs[i] = 10 - i + "";
		}

		for(int i=0;i<10;i++) {
			System.out.println("strs[" + i + "] = " + strs[i]);
		}
	}

}
