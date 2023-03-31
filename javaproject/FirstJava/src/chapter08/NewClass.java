package chapter08;

//추상 클래스를 상속하면 추상메소드를 멤버로 가지게 된다 => 추상 클래스다
public class NewClass extends AbstractClass {

	
	@Override
	void abstractMethod() {
		// 중괄호만 들어가도 메소드를 구현한 것으로 봄
		System.out.println("추상 메소드를 구현했습니다.");
		
	}
	
	
	
	

}
