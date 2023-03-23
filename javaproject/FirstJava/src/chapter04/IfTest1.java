package chapter04;

public class IfTest1 {

	public static void main(String[] args) {


		// 시험 점수가 60점 이상일 때 -> 조건식
		// "PASS" 출력 -> 조건의 결과가 참일 때 처리
		
		int score; // (변수 옆에 변수 목적을 주석 달아주는 게 좋음) 시험 점수 데이터
		score = 50;
		
		if (score >= 60) {
			// score의 값이 60점 이상
			System.out.println("PASS");
		} else {
			// score의 값이 60점보다 작다 > 60점 미만
			System.out.println("FAIL");
		}
		
		/*
		 * if (score < 60) { System.out.println("FAIL"); }
		 */
		
		
		int age = 10;
		
		if(age > 19) {
			System.out.println("투표가 가능합니다.");
		} else {
			System.out.println("아직 투표권이 없습니다.");
		}
		
		
		// 짝수/홀수 판단
		
		int num = 10;
		
		if(num % 2 == 1) {
			// 나머지 = 1
			System.out.println("홀수");
		} else {
			// 나머지 = 0
			System.out.println("짝수");
		}
	}

}
