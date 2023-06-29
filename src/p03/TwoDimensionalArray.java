package p03;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		
		int cnt = 1;
		for(int i=0; i<numsArray.length;i++) {
//			System.out.println(numsArray[i].length);
			for(int j=0; j<numsArray[i].length; j++) {
				
				numsArray[i][j] =cnt++;
					
			}
		}
		
		for(int i=0; i<numsArray.length;i++) {
			for(int j=0; j<numsArray[i].length; j++) {
				System.out.println((numsArray[i][j]));
			}
		}
	}
}
