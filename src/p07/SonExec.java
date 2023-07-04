package p07;
class Song{
	public int rank;
	public String title;
	
	public void printTitle() {

		System.out.println("노래제목 : " + title);
	}

}

public class SonExec {
	public static void main(String[] args) {
		Son s = new Son();
		s.name = "동동";
		s.job = "개발자";
		s.age = 30;
		s.hobby = "축구";
		
		s.printJob();
		s.printHobby();
		Father f = new Father();
		f.name = "둥둥이";
		Son s2 = (Son)f;
		s2.hobby = "낚시";

	}
}
