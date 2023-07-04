package p07;

public class Lol extends Game{
	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.End();
	}
	public static void main(String[] args) {
		
		Lol l = new Lol();
		l.name = "리그오브레전드";
		l.price = 0;
		l.genre = "";
		
		runGame(l);
	}
}
