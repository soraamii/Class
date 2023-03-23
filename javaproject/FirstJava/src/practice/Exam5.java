package practice;

public class Exam5 {

	public static void main(String[] args) {
		
		
//		
//	int num = 258;
//		
//		if(num < 0) {
//			System.out.println("0 미만");
//		}else if(num < 100) {
//			System.out.println("0이상 100 미만");
//		}else if(num < 200) {
//			System.out.println("100이상 200 미만");
//		}else if(num < 300) {
//			System.out.println("200이상 300 미만");
//		}else {
//			System.out.println("300이상");
//		}
//		
	int num = 258;
	
	switch(num) {
	case 0 :
		if(num < 0)
		System.out.println("0 미만");
		break;
				
	case 100 :
		System.out.println("0이상 100 미만");
		break;
		
	case 200 :
		System.out.println("100이상 200 미만");
		break;
		
	case 300 :
		System.out.println("200이상 300 미만");
		break;
		
	default :
		System.out.println("300이상");
		break;
	
	}
		

	}

}
