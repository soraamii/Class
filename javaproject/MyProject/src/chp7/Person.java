package chp7;

public class Person {

	String name;
	String id;
	
	
	
	public Person() {
		
	}
	
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	void hi() {
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
	}


}
