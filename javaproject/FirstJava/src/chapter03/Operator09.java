package chapter03;

public class Operator09 {

	public static void main(String[] args) {
		
		
		int num1 = 30;
		int num2 = 2;
		
		int age = 12;
		
		//관계연산의 결과 값 => 논리값 (true/ false)
		
		System.out.println(num1 == num2);
		System.out.println(num1 == 30);
		
		// 성인인증 체크
		System.out.println(age > 19);
		System.out.println(age < 20);
		
		System.out.println();
		
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		
		System.out.println();
		
		System.out.println(num1 != num2);
		
		
		System.out.println();
		
		
		// 성인 판단
		if(age > 19) {
			// true => 실행 코드
			System.out.println("참일 때 실행되는 구문");
			System.out.println("성인 인증! -> 입장하세요");
			
		} else {
			System.out.println("거짓일 때 실행되는 구문");
			System.out.println("아이들은 보면 안돼요!!!!");
			// false => 실행 코드
		}
		
		

	}

}
