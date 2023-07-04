package p07;


public class OverLoading { 	
	/*
	 * public이란 다른 곳(다른 클래스,패키지)에서 접근이 가능하게끔 만듬
	 * public, protected, default private = 접근 수정(제어)자
	 */
	
	public void test() {
		System.out.println("test() 호출");
	}
	public void test(int num) {
		System.out.println("test(int num) 호출");
	}
	public void test(byte num) {
		System.out.println("test(byte num) 호출");
	}
	public void test(short num) {
		System.out.println("test(short num) 호출");
	}
	public void test(long num) {
		System.out.println("test(long num) 호출");
	}
	
	public void test(String str) {
		System.out.println("test(String str) 호출");
	}
	public void test(char ch) {
		System.out.println("test(char ch) 호출");
	}

	public void test(float f) {
		System.out.println("test(float f) 호출");
	}
	public void test(double db) {
		System.out.println("test(double db) 호출");
	}

	
	public void test(boolean bl) {
		System.out.println("test(boolean bl) 호출");
	}
	

	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.test(2);
		ol.test("2");	
		ol.test(2.1);
		ol.test('3');
		ol.test(2f);
		ol.test((short)1);
		ol.test((long)1);
		ol.test((byte)1);
		ol.test(true);
		ol.test();
		}
}
