package chapter03;

public class Operator13 {

	public static void main(String[] args) {


		int num1 = 0;
		int num2 = 0;
		
		boolean result = false;
		
		result = (num1 += 10) < 0 && (num2 += 10) > 0; // num1 += 10 => num1 = num1+10
													   // (num2 += 10) > 0 의 값은 && 앞 값이 false라서 시행되지 않음
		
		System.out.println(result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		result = (num1 += 10) > 0 || (num2 +=  10) > 0;
		System.out.println(result);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}

}
