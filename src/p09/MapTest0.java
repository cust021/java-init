package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest0 {
	public static void main(String[] args) {
		Map<String,String> m = new HashMap();
		m.put("name","롤");
		m.put("company","라이엇");
		m.put("ganre","AOS");
		m.put("rank","1");
	
		Map<String,String> m1 = new HashMap();
		m1.put("name","오버워치");
		m1.put("company","블리자드");
		m1.put("ganre","FPS");
		m1.put("rank","4");
		
		Map<String,String> m2 = new HashMap();
		m2.put("name","배그");
		m2.put("company","카카오");
		m2.put("ganre","FPS");
		m2.put("rank","2");
		
		Map<String,String> m3 = new HashMap();
		m3.put("name","메이플");
		m3.put("company","넥슨");
		m3.put("ganre","MMORPG");
		m3.put("rank","3");
		
		Map<String,String> m4 = new HashMap();
		m4.put("name","서든어택");
		m4.put("company","넥슨");
		m4.put("ganre","FPS");
		m4.put("rank","5");
		
		List<Map<String,String>> mapList = new ArrayList<>();
		mapList.add(m);
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		mapList.add(m4);
		//System.out.println(mapList);
	
		for(int i=0 ; i<mapList.size(); i++) {
			Map<String,String> map = mapList.get(i);
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.print(key + " : " + map.get(key) + " , ");
			}
			System.out.println();
		}
	}
	
	
		
}
