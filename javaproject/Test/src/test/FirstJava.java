package test;

/*
  어떤 파일
  어떤 목적
  누가 작성
  언제 수정
   
 */

public class FirstJava {
	
	// 주석은 컴파일시 코드로 인식하지 않음
	//클래스 = 객체를 만드는 틀
	// 변수들 정의
	// 함수(메소드)들 정의

	//메인 메소드 -> 클래스 실행시 시작 시점
	
	public static void main(String[] args) {
		
		

		//System.out.println("First JAVA1");
		
		/*System.out.println("First JAVA2"); 
		  System.out.println("First JAVA3");
		 */
//		 System.out.println("First JAVA4");
		
		
		// 변수 : 메모리 공간 할당, 메모리 주소의 역할
		// 선언 방법
		// 자료형타입 변수이름 ; 
		
		
		// 나이를 저장하는 변수를 선언
		int age; //나이 값을 저장할 수 있는 변수 선언
		age = 20; //변수의 초기화 : 변수 선언 후 변수의 값을 처음 대입하는 것
		
		
		//원주율 : pi -> 3.141592..... <-실수 
		double pi;
		pi = 3.141592;
		
		System.out.println(age);
		System.out.println(pi); //sysout+ctrl+space
		
		int resultvalue = add(10,20);
		
		System.out.println(resultvalue);
		
		hello();
		
		hello2("손흥민");
		
		
		

	}

	
	// 정수 2개를 받아 -> 매개변수 선언
	// 더하기 연산한 -> 내부 처리
	// 결과를 반환하는 메소드 ->return 결과값

		static int add(int num1, int num2) {
		
			int result;
			result = num1 + num2;
		
			//결과값을 반환
			return result;
		
	}
	
		
		
	// 인사말을 출력하는 기능을 가지는 메소드
	// 매개변수 : 데이터 받는 정의 -> 데이터 필요X
	// 결과 반환 : X
	// 반환타입 메소드이름(매개변수){}
	// void : 반환 값이 없을 때 사용 = return이 없다
		
		static void hello() {
			System.out.println("안녕하세요!");
			System.out.println("반갑습니다.");
			
		}
		
	// 이름을 전달받아 이름과 인사말을 출력하는 메소드
	// 매개변수 ㅣ 이름 (문자열)
	// 반환 ㅣ X
		
		static void hello2(String name) {
			
			System.out.println(name);
			System.out.println("안녕하세요");
		}
		
}
