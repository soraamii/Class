package exception2;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("아이디를 입력하세요.");
		String id = sc.nextLine();
		
		for(int i = 0; i < id.length(); i++) {
			char c = id.charAt(i);
			//영문자 대/소문자/숫자
			
			if(!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9')) {
				
				try {
				//throw new Exception(); // 예외 발생
					throw new BadidInputException(id);
				} catch(Exception e) {
					System.out.println("입력 값은 영문자 소문자/대문자와 숫자만 가능합니다.");
					System.out.println(e.getMessage());
					e.printStackTrace();
					break;
					// return
					// log 파일에 오류에 대한 내용을 쓰겠다.
					// 오류 내용을 DB에 저장
					// 응답 및 결과는 프로그램 종료 후 다시 시작하도록 하겠다.
					
				}
			}
		}
		
	}

}
