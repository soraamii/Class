package array;

public class ArrayExam2 {

	public static void main(String[] args) {

		// student 타입의 배열 생성 :  데이터 10개 저장 가능
		Student[] students = new Student[10];
		students[0] = new Student("son01", 100, 100, 100);
		students[1] = new Student("son01", 100, 100, 100);
		students[2] = new Student("son01", 100, 100, 100);
		students[3] = new Student("son01", 100, 100, 100);
		students[4] = new Student("son01", 100, 100, 100);
		students[5] = new Student("son01", 100, 100, 100);
		students[6] = new Student("son01", 100, 100, 100);
		students[7] = new Student("son01", 100, 100, 100);
		students[8] = new Student("son01", 100, 100, 100);
		students[9] = new Student("son01", 100, 100, 100);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("================================");
		
		for(Student student : students) {
			System.out.println(student.result());
		}
		

	}

}
