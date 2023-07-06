package p08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoList {
	public static void main(String[] args) {
		List<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int rNum = r.nextInt(6) + 1;
			 
				if (lotto.indexOf(rNum) == -1) {  //indexOf에서 다시 돌면서 -1 해준다 
					lotto.add(rNum);
			}else { 							//하지만 else 을 해주면서  아니면 i--해주면서 다시 돌아간다.
				i--;
			}
		}
		for (int i = 0; i < lotto.size(); i++) {
			System.out.println(lotto.get(i));
		}
	}

}