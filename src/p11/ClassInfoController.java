package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {
	public List<Map<String, String>> getClassInfoList(Map<String,String> pa) {
		ClassInfoService ciService = new ClassInfoService();
		return ciService.getClassInfoList(pa);
	}

	public int insertclassInfo(Map<String, String> classInfo) {
		return 0;
	}

	public int delteclassInfo(Map<String, String> classInfo) {
		return 0;
	}

	public static void main(String[] args) {
		ClassInfoController ciController = new ClassInfoController();
		Map<String,String> pa = new HashMap<>();
		pa.put("uiName", "%");
		pa.put("uiDesc", "%");
		List<Map<String,String>> classInfoList = ciController.getClassInfoList(pa);
		System.out.println("번호\t이름\tDESC");
		for(Map<String,String> classInfo : classInfoList) {
			System.out.println(classInfo.get("uiNum") + "\t" + classInfo.get("uiName")+ "\t" + classInfo.get("uiDesc"));
		}
	}
}
