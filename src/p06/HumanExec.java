package p06;

public class HumanExec {

	public static void main(String[] args) {
		/*
		 * 5명의 사람을 만듬
		 * 각각의 이름과 나이를 다르게 입력하세요
		 * 길이 5개짜리 Human[] 배열을 만듭니다.
		 * 반복문을 사용하여 최고령 , 최연소가 누구인지 출력하면 됩니다.
		 * 평균이랑 제일 근접한 사람 출력
		 */
		
		Human h1 = new Human();
		h1.name ="김씨";
		h1.age = 20;
		
		Human h2 = new Human();
		h2.name ="이씨";
		h2.age = 24;
		
		Human h3 = new Human();
		h3.name ="박씨";
		h3.age = 26;
		
		Human h4 = new Human();
		h4.name ="최씨";
		h4.age = 19;
		
		Human h5 = new Human();
		h5.name ="심씨";
		h5.age = 29;
		
		Human[] humans = new Human[5];
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3;
		humans[3] = h4;
		humans[4] = h5;
		
		Human firstHuman = humans[0];
		Human lastHuman = humans[0];
	
		for(int i=0; i<humans.length; i++) {
			Human human = humans[i];
			if(firstHuman.age > human.age){
				firstHuman = human;	
			}if(lastHuman.age < human.age){
				lastHuman = human;		
			}
		}	
		int sum = 0;
		System.out.println("나이 1st : "+ lastHuman.name + lastHuman.age);
		System.out.println("나이 5st : "+ firstHuman.name + firstHuman.age);
		for(int i = 0; i<humans.length; i++) {
			sum += humans[i].age;
		}
		System.out.println("나이 합산 : " +sum);
		int avg = sum/humans.length;
		System.out.println("나이 평균 : " +avg);
		
	}
}
