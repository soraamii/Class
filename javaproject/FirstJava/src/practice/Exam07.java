package practice;

public class Exam07 {

	public static void main(String[] args) {
		
		//1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성​
	
		int cnt = 1;
		
		while(cnt <= 100) {
			
			System.out.println(cnt++);
			
			//cnt++;
			
			}
		
		System.out.println("-----------------");
		
		do {
			//cnt--;
			System.out.println(--cnt);
			
		} while(cnt > 1);
			
	}
}

