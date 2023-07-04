package p07;

public class Son extends Father{   //상위는 Father 하위는 Son  // 상속 개념 불러온다는 개념
	public String hobby;
	
	public void printHobby() {
		System.out.println(name + "님의 취미는 " + hobby +"입니다.");
	}
	
}
