package chapter04;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		int score = 46;
		
		// 점수별 학점 체크
		
		// score / 10 
		// 100 -> 10
		// 90~99 -> 9 90이상
		// 80~80 -> 9 80이상 90 미만
		
		
		switch (score / 10) {
		case 10 : 
			System.out.println("A");
			break;
		
		case 9 :
			System.out.println("A");
			break;

		case 8 :
			System.out.println("B");
			break;

		case 7 :
			System.out.println("C");
			break;

		case 6 :
			System.out.println("D");
			break;

		default :
			System.out.println("F");
			break;
		}
		
		
		
		
		
		
		int key = 60;
		
				
		
		switch (key) {
		case 10: // key == 10
			System.out.println("10입니다.");
			
			break; // 감싸고 있는 블록을 탈출
			
		case 20:
			System.out.println("20입니다.");
			
			break;

		/*
		 * default: System.out.println("10 또는 20이 아닌 숫자입니다."); break;
		 */
		}
	}

}
