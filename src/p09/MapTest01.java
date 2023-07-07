package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest01 {
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("name", "비빔밤");
		m.put("country", "한국");
		m.put("rank", "1");
		m.put("kind", "한식");
		
		Map<String,String> m1 = new HashMap<>();
		m1.put("name", "초밥");
		m1.put("country", "일본");
		m1.put("rank", "2");
		m1.put("kind", "일식");
		
		Map<String,String> m2 = new HashMap<>();
		m2.put("name", "불고기");
		m2.put("country", "한국");
		m2.put("rank", "3");
		m2.put("kind", "한식");
		
		Map<String,String> m3 = new HashMap<>();
		m3.put("name", "피쉬앤칩스");
		m3.put("country", "영국");
		m3.put("rank", "5");
		m3.put("kind", "양식");
		
		Map<String,String> m4 = new HashMap<>();
		m4.put("name", "스테이크");
		m4.put("country", "미국");
		m4.put("rank", "4");
		m4.put("kind", "양식");
		
		Map<String,String> m5 = new HashMap<>();
		m5.put("name", "자장면");
		m5.put("country", "중국");
		m5.put("rank", "5");
		m5.put("kind","중식");
		
		List<Map<String,String>> foodmap = new ArrayList<>();
		foodmap.add(m);
		foodmap.add(m1);
		foodmap.add(m2);
		foodmap.add(m3);
		foodmap.add(m4);
		foodmap.add(m5);
		
	/*	for(int i=0; i<foodmap.size(); i++) {
			Map<String,String> map = foodmap.get(i);
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.print(key + " : " + map.get(key) + " , ");
			}
			System.out.println();
		}
		*/
		
		for(Map<String,String> map : foodmap) {
			System.out.println(map);
		}
	}
	
}


