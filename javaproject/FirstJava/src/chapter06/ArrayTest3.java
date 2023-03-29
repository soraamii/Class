package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 배열 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
				
		// 배열 생성
		scores = new int [15]; // int 타입의 요소 10개를 가지는 배열 인스턴스
				
				
		for(int i = 0; i < scores.length; i++) {
			//System.out.println(scores[i]);
		}
				
		//System.out.println("==============================");
				
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
		scores[10] = 62;
		scores[11] = 83;
		scores[12] = 52;
		scores[13] = 71;
		scores[14] = 41;
		
		resultPrint(scores);
				
			
}
	
	// 점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	
		static void resultPrint(int[] arr) { //int[] arr = scores;
				
		// 전달 받은 배열 : int 타입의 배열이다 / size 제약 없음
		
		int sum = 0;
		float avg = 0.0f;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum/(float)arr.length;
		System.out.println("============================");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
}

}









