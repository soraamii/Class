package first;

public class Calculator {

	public static void main(String[] args) {
		
		int num = 10;

		System.out.println( add(20,10) );
		System.out.println( sub(20,10) );
		System.out.println( mul(10,5) );
		System.out.println( div(10f,3f) );
		System.out.println( div(num,3) ); // 형변환되어서 됨
	}

	// ① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	static long add(long num1, long num2) {

		// long result = num1 + num2;
		// return result;

		return num1 + num2;
	}

	// ② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.

	static long sub(long num1, long num2) {
		return num1-num2;
	}
	
	//③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	
	static long mul(long num1, long num2) {
		return num1 * num2;
	}
	
	//④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	static float div(float num1, float num2) {
		return num1 / num2;					//타입과 return 타입 일치
	}
	
	
	
	
	
}
