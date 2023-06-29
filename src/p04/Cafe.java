package p04;

public class Cafe {
	
		
		public static String getCoffee(String order, int price) {
			int coffeePrice = 5000;
			
			if(coffeePrice>price) {
				return (coffeePrice-price) + "원이 부족합니다.";
			} 
			String str = " ";
			if(coffeePrice<price){
				str = (price-coffeePrice) + "원 거스름 돈 입니다.";
			}
			return "주문하신 "+ coffeePrice +"원 짜리 "+ order +"가 준비되었습니다. " + str;  
		}
		public static void main(String[] args) {
			String coffee = getCoffee("아아",6000);
			System.out.println(coffee);
			coffee = getCoffee("아아",5000);
			System.out.println(coffee);
			coffee = getCoffee("아아",4000);
			System.out.println(coffee);
		}
	}

