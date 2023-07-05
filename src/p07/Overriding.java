package p07;

class Coffee{
	public String name;
	public int price;
	
	public String toString() {
		return "name : " + name + ", price : " + price;
	}
}
public class Overriding {						//오버라이딩은 무조건 데이터타입이 같아야함
	public static void main(String[] args) {
		Coffee c1 = new Coffee(); 
		c1.name = "아이스 아메리카노";
		c1.price = 2000;

		System.out.println(c1);
		
	}
}
