package p05;

public class SongExec {
	
	public static void printSong(Song[] songs) {
		for(Song s : songs) {
		System.out.println("제목 : " + s.name);
		System.out.println("가수 : " + s.singer);
		System.out.println("랭크 : " + s.rank);
	
		}
		
	}
	public static void main(String[] args) {
		Song s = new Song();
		Song s2 = new Song();
		Song s3 = new Song();
		Song s4 = new Song();
		Song s5 = new Song();
				
		Song[] songs = new Song[5];
	
		
		songs[0] = new Song();
		songs[0].name = "애국가";
		songs[0].singer = "국민";
		songs[0].rank = 1;

		songs[1] = new Song();
		songs[1].name = "애국가2";
		songs[1].singer = "국민2";
		songs[1].rank = 2;
		
		songs[2] = new Song();
		songs[2].name = "애국가3";
		songs[2].singer = "국민3";
		songs[2].rank = 3;
		
		songs[3] = new Song();
		songs[3].name = "애국가4";
		songs[3].singer = "국민4";
		songs[3].rank = 4;
		
		songs[4] = new Song();
		songs[4].name = "애국가5";
		songs[4].singer = "국민5";
		songs[4].rank = 5;
		
		Song fSong = songs[0];
		Song lSong = songs[0];
		
		for(int i=1; i<songs.length; i++) {
			if(fSong.rank > songs[i].rank) {
				fSong =songs[i];
			}if(lSong.rank < songs[i].rank) {
				lSong =songs[i];
			}
		}
		System.out.println("일등 : " + fSong.singer + " 의 " + fSong.name);
		System.out.println("꼴등 : " + lSong.singer + " 의 " + lSong.name);
		//printSong(songs);
		
		int maxRank = songs[0].rank;
		int maxIdx = 0;
		
		int minRank = songs[0].rank;
		int minIdx = 0;
		for(int i=1; i<songs.length; i++) {
			
				if(minRank>songs[i].rank) {
					minRank = songs[i].rank;
					minIdx = i;
				}
				
				if(minRank<songs[i].rank) {
					maxRank = songs[i].rank;
					maxIdx = i;
				}
			
		}
		System.out.println("1등 : " +songs[minIdx].singer + " 의 " + songs[minIdx].name);
		System.out.println("꼴등 : " +songs[maxIdx].singer + " 의 " + songs[maxIdx].name);
	}
}
