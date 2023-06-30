package p05;

public class HumanExec {

	public static void main(String[] args) {
	
		Human h = new Human();
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3= new Human();
		Human h4 = new Human();
		
		Human[] human = new Human[5];
		
		human[0] = new Human();
		human[0].name = "홍길동";
		human[0].money = 10000;
		
		human[1] = new Human();
		human[1].name = "김길동";
		human[1].money = 5000;
		
		human[2] = new Human();
		human[2].name = "최길동";
		human[2].money = 20000;
		
		human[3] = new Human();
		human[3].name = "박길동";
		human[3].money = 20000;
		
		human[4] = new Human();
		human[4].name = "이길동";
		human[4].money = 15000;
		
		
		
		int sum =0;		
		for(int i=0; i<human.length; i++) {
			sum+= human[i].money;
		}
		System.out.println("총액 : " + sum);
		int avr =sum/human.length;
		System.out.println("평균 : " + (sum/human.length));
		String names ="";
		for(int i=0; i<human.length; i++) {
			
				if(avr<=human[i].money){
				names += human[i].name + "님, ";
			}
		}
		
		names = names.substring(0, names.length() -2);
		System.out.println("평균이상 : "+names);
		
		//5명의 총 머니 총 평균 구하시오.  // 평균이상 사람들 만 출력
	}
	
}

