package chapter11;

import java.util.Date;

public class MyClass<T> {
	
	// 변수, 메소드의 반환 타입, 메소드 매개변수의 타입
	T val;
	
	
	
	public MyClass(T val) {
		super();
		this.val = val;
	}
	
	public MyClass() {
		super();
		this.val = val;
	}

	T getval() {
		return val;
	}
	
	void setVal(T val) {
		this.val = val;
	}
	
	public static void main(String[] args) {
		
		MyClass<String> myClass = new MyClass<String>();
		myClass.setVal(new Date()); // 잘못된 타입이 저장되지 않도록 처리가 됨 = 타입의 안정화
		myClass.setVal("KING"); // String 타입의 데이터만 전달 가능
		System.out.println(myClass.getval()); // String 타입의 데이터만 반환
	}

	private void setVal(Date date) {
		// TODO Auto-generated method stub
		
	}
	

}
