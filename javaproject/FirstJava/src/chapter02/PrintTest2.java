package chapter02;

public class PrintTest2 {

	public static void main(String[] args) {
		
		String name = "손흥민";
		
		// 안녕하세요! 저는 OOO입니다. 나이는 OO살입니다.
		System.out.print("안녕하세요! 저는 ");
		System.out.print(name);
		System.out.print("입니다.");
		
		System.out.println();
		
		System.out.printf("안녕하세요! 저는 %s입니다. 나이는 %d살입니다.", name, 20);
		
		
		//ctrl+F11 -> 결과값 산출
		//문자일 땐 작은따옴표(')
		
		System.out.println();
		System.out.printf("정수 : %d, 실수 : %f", 10, 13.500000 );
		System.out.println();
		System.out.printf("문자 : %c, 문자열 : %s", 'Z', "KING");
		
		
		
	}

}
