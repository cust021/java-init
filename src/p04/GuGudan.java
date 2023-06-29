package p04;

import java.util.Scanner;

public class GuGudan {
	
	public static void printGuGuDan(int firstDan, int sencondDan){
		

		for(int i=1; i<=firstDan; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=sencondDan; j++) {
				
				System.out.println(i + " x " + j + " = "+ i*j);
		
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		printGuGuDan(5,7);
	}
}
	
	
	

