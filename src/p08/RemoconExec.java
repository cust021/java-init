package p08;

public class RemoconExec {
	public static void main(String[] args) {
		/*
		 * AirconRemocon ar = new AirconRemocon(); TVRemocon tv = new TVRemocon();
		 * 
		 * Remote r1 = ar; Remote r2 = tv; Remote[] remotes = new Remote[2]; remotes[0]
		 * = r1; remotes[1] = r2;
		 */

		// ↓ 3줄 요약

		Remote[] remotes = new Remote[2];
		remotes[0] = new AirconRemocon();
		remotes[1] = new TVRemocon();

		for (int i = 0; i < remotes.length; i++) {
			remotes[i].on();
			if (remotes[i] instanceof AirconRemocon) {    //instanceof 알수 없고 찾을 수 없을때 "??일 때" 라고 정의함
				AirconRemocon ar = (AirconRemocon)remotes[i];
				ar.tempUp();
				ar.tempDown();
			} else if (remotes[i] instanceof TVRemocon) {
				TVRemocon tv = (TVRemocon)remotes[i];
				tv.chUp();
				tv.chDown();
			}
			remotes[i].off();
		}
	}
}
