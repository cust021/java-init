package p04;
													
class Test{
	public static int getNum() {					//변수 뒤 ()=메소드
		return 1;									//데이터 타입에 맞게 리턴 값도 동일하게 적용해야 오류가 없음
	}
	
	public static int getNum2() {					//변수 뒤 ()=메소드
		return 1;									//데이터 타입에 맞게 리턴 값도 동일하게 적용해야 오류가 없음
	}
}
public class MedhodTest {
	public static int getNum() {
		return 0;	
	}
	public static String getStr() {
		return "";
	}
	public static void test() {
		return;
	}
	public static void main(String[] args) {
		int a = 1;
		int b = getNum();
		
	}
} 