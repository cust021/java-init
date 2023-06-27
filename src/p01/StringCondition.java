package p01;

public class StringCondition {

	public static void main(String[] args) {
		String s1 = "123";
		if(s1 =="123") {
			System.out.println("s1은 123");
		}else {
			System.out.println("s1은 123이 아님");
		}
		
		String s2 = new String("123");
		if(s2 =="123") {
			System.out.println("s2은 123");
		}else {
			System.out.println("s2은 123이 아님");
		}
	}
	//trim 앞 뒤 공백 제거
	//equals 동일 한지 true 체크

}
