package p01;

public class StringTest {

	public static void main(String[] args) {
		String str = "1234567890";
		char c = str.charAt(5);
		System.out.println(c);
		
		String s1 = "1";
		String s2 = "1";
		System.out.println(s1 == s2);
		String s3 = new String("1");
		System.out.println(s1 == s3);
		String s4 = new String("1");
		System.out.println(s1 == s4);
		System.out.println(s3.equals(s4));
		
		
		int idx = str.indexOf("3");
		System.out.println(idx);
		
		int idx2 = str.indexOf("6");
		System.out.println(idx2);
		
		String str2= str.substring(idx);
		System.out.println(str2);
		
		str2 = str.substring(idx, idx2);
		System.out.println(str2);
		
		str = str.replace("1", "one");
		System.out.println(str);
		
		String name = "Park" ;
		name = name.toUpperCase () ;
		System.out.println(name);
		name = name.toLowerCase () ;
		System.out.println(name);
	}

}
