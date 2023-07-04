package p07;

class Mother {
	public void work() {
		
		System.out.println("어머님이 집안일을 하십니다.");
	}
}

class Daughter extends Mother {
	public void work() {
		System.out.println("딸이 출근을 합니다.");
	}


	public void work(String job) {
		
		System.out.println("딸이 " + job + "을 합니다");
	}
}

public class Overriding2 {
	public static void work(Mother[] ms) {
		
		for(int i = 0; i<ms.length; i++) {
			Mother m =  ms[i];
		
		// m이 Daughter라고 불릴 수 있다면
		// 딸이 개발을 합니다.
			if(m instanceof Daughter) { 	//instanceof = 대신 불릴 수 있냐
				Daughter d = (Daughter)m;
				d.work("개발");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Daughter d = new Daughter();		 //뒤에 메모리 생성에 따라 초기화 값(메모리 생성)이 따라감
		
		Mother m = new Mother();
		
		Mother[] ms = new Mother[2];
		ms[0] = d;
		ms[1] = m;
		work(ms);
		
	}
}