package p07;

public class SchoolExec {
	public static void main(String[] args) {
		// Object obj = new MiddleSchool();
		// MiddleSchool ms = (MiddleSchool) obj;
		// System.out.println(ms.studentType);
		School middleSchool = new MiddleSchool();
		middleSchool.name = "양주";
		School highSchool = new HighSchool();
		highSchool.name = "양주";
		School school = new School();
		school.name = "학교";

		School[] sh = new School[3];

		sh[0] = middleSchool;
		sh[1] = highSchool;
		sh[2] = school;
		for (int i = 0; i < sh.length; i++) {
			System.out.print(sh[i].name);
			if (sh[i] instanceof MiddleSchool) {
				MiddleSchool ms = (MiddleSchool) sh[i];
				ms.studentType = "중학교";
				System.out.println(ms.studentType);

			} else if (sh[i] instanceof HighSchool) {
				HighSchool hs = (HighSchool) sh[i];
				hs.studentType = "고등학교";
				System.out.println(hs.studentType);

			} else {
				System.out.println();
			}
		}

		System.out.println();
	}
}
