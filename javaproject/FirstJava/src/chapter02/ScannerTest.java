package chapter02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		// 사용자 키보드 입력
		//Scanner in -> 객체, 주소값 (참조형 변수) 
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요!! >> ");
		
		String name = in.nextLine();
		System.out.println("안녕하세요! " + name);

	}

}