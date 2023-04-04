package exception;

public class BadIdInputException extends Exception {

	//② 예외 클래스 이름은 BadIdInputException이라고 정의합시다
	public BadIdInputException(String message) {
		super("사용자의 입력 값이 올바르지 않습니다.");
		
	}
	
	

}
