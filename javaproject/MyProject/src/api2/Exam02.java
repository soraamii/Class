package api2;

public class Exam02 {

	public static void main(String[] args) {
		
	
	//1~100,000,000까지 더하기하는 연산의 실행 시간을 측정하는 프로그램을 만들어봅시다. 
	
	long startTime = System.currentTimeMillis();
	
	int sum = 0;
	
	for(int i = 0; i <= 100000000; i++) {
		
		sum += i;
		
	}
	
	long endTime = System.currentTimeMillis();
	
	System.out.println("실행 시간 : " + (endTime - startTime));
}
}
