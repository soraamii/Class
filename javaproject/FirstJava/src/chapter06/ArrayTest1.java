package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		
		
		// 배열 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열 생성
		scores = new int [10]; // int 타입의 요소 10개를 가지는 배열 인스턴스
		
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("==============================");
		
		// 배열 요소 참조
		// 배열이름[index]
		// index => 0~n-1
		// 요소의 개수 => 배열변수.length
		
		scores[0] = 61;
		scores[1] = 79;
		scores[2] = 88;
		scores[3] = 97;
		scores[4] = 56;
		scores[5] = 45;
		scores[6] = 34;
		scores[7] = 23;
		scores[8] = 12;
		scores[9] = 100;
		//scores[10] = 60;
		
		
		// 총합
		int sum = 0;
		// 평균값
		float avg = 0.0f;
		
		//System.out.println(scores[1]);
		
		// index => 0~9
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			
			// 합의 연산
			
			sum = sum + scores[i];
			
		}
		
		avg = (float)sum/scores.length;
		// avg = sum/10f;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
