package exception;

import java.util.Scanner;

public class ExceptionExam10 {

	public static void main(String[] args) {
		// 콘솔에서 사용자 아이디를 입력 받아
		// 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.
		Scanner sc = new Scanner(System.in);

		System.out.println("영문자와 숫자로 이루어진 값을 입력하시오.");

		String id = null;

		// ① 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.

		id = sc.nextLine();
		for (int i = 0; i < id.length(); i++) {
			char msg = id.charAt(i);

			try {

				if (!(msg >= 'a' && msg <= 'z' || msg >= 'A' && msg <= 'Z')) {
					BadIdInputException e = new BadIdInputException("잘못된 값 입력");
					throw e;
				}
			} catch (BadIdInputException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());

			}

		}
	}
}
