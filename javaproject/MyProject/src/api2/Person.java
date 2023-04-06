package api2;

public class Person {

	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	// 위 Person 클래스의 equals() 메소드를 오버라이딩해서

	@Override
	public boolean equals(Object obj) {

		boolean result = false;

		if (obj != null && obj instanceof Person) {
			Person ps = (Person) obj;
			result = this.personNumber.equals(ps.personNumber);
		}

		return result;
	}

	// 주민등록번호가 같으면 같은 인스턴스로 판별하는 프로그램을 만들어봅시다.
	
	public static void main(String[] args) {
		
		Person pn1 = new Person("강백호","970729-1111111");
		Person pn2 = new Person("소형준","970729-1111111");
		
		System.out.println(pn1.equals(pn2));
		
	}

}
