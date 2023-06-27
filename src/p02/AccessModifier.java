package p02;
//class 영역은 선언은 되나 출력은 안됨 하지만 static 영역에선 선언과 출력이 가능함
public class AccessModifier {
	int b =5;
	
	public static void main(String[] args) {
		int i =1;
		System.out.println(i);
		 AccessModifier am = new  AccessModifier(); //객체 생성(데이터변수) //대문자(참조형) 뒤 (변수(am))
		 System.out.println(am.b);
		 AccessModifier am2 = new  AccessModifier();
		 System.out.println(am.b);
		 
	}

}
//대문자는 참조형 소문자는 기본형(변수와 값만 존재)