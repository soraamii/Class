package practice;

public class Exam09 {

	public static void main(String[] args) {
	
		//for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성
		
	int result = 1;
		
		for(int num = 1; num <= 10; num++ ) {
			
			//System.out.println(num);
			//result = result * num;
			
			result *= num;
				
	}
		System.out.println("1~10까지 숫자들을 곱한 결과 : " + result);

	}
}
