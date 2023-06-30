package p05;

public class SongExec2 {
	/*
	public static void printSongs(Songss[] songss) {
		for(Songss s : songss) {
		  System.out.println("1."+ s.name);
			System.out.println("2."+ s.singer);
			System.out.println("3."+ s.rank);
		}
	}
	*/
	
	public static void main(String[] args) {
		
		Songss s = new Songss();
		
		
		Songss[] songs1 = new Songss[3];
		
		songs1[0] = new Songss();
		songs1[0].name = "하입보이";
		songs1[0].singer = "뉴진스";
		songs1[0].rank = 10;
		
		String name = "";
		for(int i=0; i<songs1.length; i++) {
			
		
		}
		System.out.println(name);
		//printSongs(songs1);
	}
}
