package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = null;
	
		System.out.println("프로그램을 시작합니다.");
		System.out.println("정수 하나를 입력하세요.");
		
		int num1 = 0;
		int num2 = 0;
		
		
		
		try {
			// try 블럭 : 예외가 발생 예상되는 코드를 감싸주는 역할
			num1 = sc.nextInt(); // 예외 발생 가능
			
			System.out.println("두 번째 정수를 입력하세요.");
			
			num2 = sc.nextInt(); // 예외 발생 가능
			
			
			System.out.println(num1/num2); // 예외 발생 가능
			
			System.out.println("연산이 성공적으로 실행되었습니다.");
			
		} catch(ArithmeticException e) {
			
			// catch 블럭 : 예외 타입에 따라 예외 처리를 해주는 블럭
			
			System.out.println("0으로 나누기는 불가합니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			//System.out.println("프로그램을 종료합니다.");
			//return; // main 메소드 종료 = 프로그램 종료
		} catch(InputMismatchException e) {
			
			System.out.println("숫자만 입력하세요.");
		} catch(Exception e) {
			// 대부분의 Exception 클래스는 Exception을 상속하고 있음
			// 상위에 입력X -> pdf p.16
			System.out.println("!!!!!!!!!예외가 발생했습니다.");
			System.out.println(e.getMessage());
		} finally {
			
			//finally -> 선택적
			//try 블럭으로 진입하면 무조건 실행
			System.out.println("무조건 실행하는 구문입니다.");
		}
		
		
		System.out.println("프로그램을 종료합니다.");
	}

}
