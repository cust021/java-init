package p05;

public class FoodExec {
	
	public static void printFood(Food[] foods) {
		for(Food f : foods) {
			

			System.out.println("이름 : "+f.name);
		System.out.println("가격 : "+f.price + "원");
		System.out.println("종류 : "+f.type);
		}
	}
	public static void main(String[] args) {
		Food f= new Food();
		Food f1 = new Food();
		Food f2 = new Food();
		Food f3 = new Food();
		Food f4 = new Food();
		
		
		f.name = "삼겹살";
		f.price = 15000;
		f.type ="한식";
		
		f1.name = "목살";
		f1.price = 13000;
		f1.type ="한식";
		
		f2.name = "돈가스";
		f2.price = 10000;
		f2.type ="일식";
		
		f3.name = "라멘";
		f3.price = 8000;
		f3.type ="일식";
		
		f4.name = "짜장면";
		f4.price = 7000;
		f4.type ="중식";
		
		
		
		Food[] foods = new Food[5];		
		foods[0] = f;
		printFood(foods);
		
		foods[1] = f;
		printFood(foods);
		
		foods[2] = f;
		foods[3] = f;
		foods[4] = f;
		
	/*	printFood(f);
		printFood(f1);
		printFood(f2);
		printFood(f3);
		printFood(f4);
	*/
	}
}

 //학교 지원금 70 + 주말 알바 100 + 퇴직금 + 50 = 220
