package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {
	public List<Map<String, String>> getClassInfoList(Map<String,String> pa) {
		ClassInfoRepository ciRepo = new ClassInfoRepository();
		return ciRepo.getClassInfoList(pa);
	}
	public int insertClassInfo(Map<String,String> ClassInfo) {
		return 0;
	}
}
