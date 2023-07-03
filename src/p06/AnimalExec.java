package p06;

public class AnimalExec {
	
	public static void printanlmals(Animal[] animals) {	//새로운 printanlmals 메소드 출력하면서 31번째 배열과 대입

		for(int i=0; i<animals.length;i++) {		//반복문을 만들어 animai.java 클래스에 메소드내용을
			Animal animal = animals[i];				//가져와 출력합니다.
			animal.run();
			if(!animal.name.equals("냥")) {
				animal.hunt();
			}
			if("새".equals(animal.type)) {
				animal.fly();
			}
			animal.eat();	
		}
	}
	
	
	public static void main(String[] args) {
		Animal tiger = new Animal();				// 변수를 선언하고 초기화 시켜준 뒤 변수에 이름 속성을 부여
		tiger.name = "호돌";
		tiger.type = "호랑이";

		Animal cat = new Animal();  //메소드 선언한 후 클래스가 있으면 바로 출력
		cat.name = "냥";
		
		Animal bird = new Animal();  
		bird.name = "구구";
		bird.type = "새";
	
		Animal[] animals = new Animal[3];  // 5번 째 줄 반복분 출력을 위한 Animal배열
		animals[0]= tiger;
		animals[1]= cat;
		animals[2]= bird;
		/*
		for(int i=0; i<animals.length;i++) {
			Animal animal = animals[i];
			animal.run();
			if(!animal.name.equals("냥")) {
				animal.hunt();
			}
		
			if("새".equals(animal.type)) {
				animal.fly();
			}
			animal.eat();	
		}
		*/
		printanlmals(animals);		//5번 째 줄인 printanlmals animals를 출력하며 끝
	}
}