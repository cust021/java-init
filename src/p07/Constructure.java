package p07;

import java.util.Scanner;

public class Constructure {
	public Constructure(){		//생성자
		System.out.println("어? 나 불렀니?");
	}
	public Constructure(int num) {
		System.out.println("어? int num 불렀니?");
	}
	public static void main(String[] args) {
		Constructure c = new Constructure();
		Scanner scan = new Scanner(System.in);
		
	}
}
