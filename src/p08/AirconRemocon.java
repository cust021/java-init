package p08;

public class AirconRemocon extends Remocon{
	public void AirconRemocon() {
		System.out.println("에어컨 리모콘에 배터리 넣음.");
	}	
	
	public void on() {
		System.out.println("에어컨을 킵니다.");
	}

	public void off() {
		System.out.println("에어컨을 끕니다.");
	}
	public void tempUp() {
		System.out.println("온도을 올립니다.");
	}
	public void tempDown() {
		System.out.println("온도을 내립니다.");
	}
}
