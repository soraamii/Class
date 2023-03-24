package practice;

public class Exam06 {

	public static void main(String[] args) {
		
		//while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성
		
		int num = 1;
		int sum = 0; // 합을 저장하는 변수, 합의 초기화 = 0
		
		while (num < 100) {
			
			// 반복 처리하는 문장 : 합을 구하는 연산
		
			
			//sum = num + sum; 둘 다 가능
			sum += num;
			
			num++;
		}
		
		
		sum = 0;
		// 지역 변수 ㅣ 블록 안에서 선언된 변수, 블록 안에서만 사용 가능
		for (int i = 1; i < 100; i++) {
			sum += i;
			
			
		}
		System.out.println("1~99까지의 합 : " + sum);
	}

}
