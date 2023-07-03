package p06;

//static 은 쓰는 순간부터 끝까지 기억

class Car{
	public  String name;
	public static String type;
}
public class InstanceTest {

	public static void main(String[] args) {
		Car.type = "승용차";
		Car sonata = new Car();
		System.out.println(sonata.name); //null 
		sonata.name = "소나타";
		System.out.println(sonata.name);
		
		Car c = null; 
		System.out.println(c);
//		System.out.println(c.name);
		
		c = new Car();
		System.out.println(c.name);
		
		c = new Car();
		c.name = "소나타";
		
		c = new Car();
		System.out.println(c.name);
		
		Car c1 = new Car();
		c1.name = "소나타";
		System.out.println(c1.name);
		
		Car c2 = new Car();
		c2.name = "아반떼";
		System.out.println(c2.name);
	}
}
