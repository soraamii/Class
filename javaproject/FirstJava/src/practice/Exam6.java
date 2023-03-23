package practice;

public class Exam6 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while (num < 100) {
			System.out.println(sum);
			
			sum = num + sum;
			
			num++;
		}

	}

}
