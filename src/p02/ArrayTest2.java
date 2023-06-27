package p02;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] strs = new String[10];  // 
		/*
		 * 0 ->2
		 * 1-> 4
		 * 2-> 8
		 * ....
		 * 9-> 20
		 */
		for(int i=0; i<10; i++) {
			strs[i]=Integer.toString((i+1)*2);
			System.out.println( i+ " " + strs[i]);
			
		}
		
		
	}

}
