package chapter07;

public class SmartPhoneImpl1 extends Phone {
	
	String model;

	public SmartPhoneImpl1(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	@Override // 오버라이딩을 목적으로 하는 메소드라면 안전하게 사용 가능
	void call() {
		super.call();
		System.out.println("이어팟을 이용해서 통화합니다.");
	}

	public static void main(String[] args) {
		SmartPhoneImpl1 phone = new SmartPhoneImpl1("010-2222-5555", "Google");
		
		phone.call();
	}

	

}
