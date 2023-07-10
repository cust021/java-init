package p11;

final class Test{
	public final void Test() {  //method에 final이 붙을 경우 overriding 불가!
		System.out.println("난 Test꺼!"); //method에 final이 붙을 경우 overriding 불가!
	}
}
public class FinalTest extends Test{
	public final void test() {
		System.out.println("난 FinalTest꺼!");
	}
	public static void main(String[] args) {
		int num = 1;
		num =2;
	}
}
