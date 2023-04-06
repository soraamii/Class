package chapter11;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
	
		HashSet<String> set = new HashSet<>();
		
		Object o;
		Integer i;
		
		set.add("손흥민");
		set.add("박지성");
		set.add("이강인");
		set.add("손흥민"); // 중복 허용 X 
		set.add("이강인"); // 중복 허용 X 
		
		System.out.println("요소의 개수 : " + set.size());
		
		for(String name : set) {
			System.out.println(name);
		}
		
		HashSet<Integer> number = new HashSet<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(10);
		number.add(30);
		
		for(Integer num : number) {
			System.out.println(num);
		}
		
		
	}

}
