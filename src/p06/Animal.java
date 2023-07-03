package p06;

public class Animal {
	
	public String name;
	public String type;
	public char trans;
	public String addess;


	public void eat() {						// static 있을 경우 static 메소드 
	System.out.println(name + "이 먹는다. " );
	}

	public void run() {
	System.out.println(name + "이 달린다.");
	}

	public void hunt() {
	System.out.println(name + "이 사냥한다. ");

	}
	public void fly() {
		System.out.println(name + "이 납니다. " + "Type="+ type);

		}
}