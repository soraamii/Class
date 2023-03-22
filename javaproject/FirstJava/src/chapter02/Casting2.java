package chapter02;

public class Casting2 {

	public static void main(String[] args) {

		byte b = 10;
		int i = b; //(int)b; <- (int)생략 가능
		
		System.out.println("i = " + i);
		System.out.println("b = " + b);
		
		int i2 = 300;
		byte b2 = (byte)i2; //역방향 변환은 값이 바뀔 수 있으니 주의해야 함
		
		System.out.println("i2 = " + i2);
		System.out.println("b2 = " + b2);

	}

}
