package todo.dao;

// DAO : 데이터베이스와 상호 작용하기 위한 객체


public class TodoDAO {
	
	// 싱글톤으로 생성 -> 생성자를 private 형태로 선언, static 메소드를 정의하여 구현 
	// -> DAO 객체를 단 하나의 인스턴스로 유지
	
	// 생성자
	private TodoDAO() {
	}
	
	// 인스턴스 생성 -> 내부에서 생성 private static
	private static TodoDAO dao = new TodoDAO();
	
	// 외부에서 TodoDAO의 참조값을 얻어갈 수 있는 메소드 -> public static
	// TodoDAO 클래스의 getInstance 메소드를 호출 -> TodoDAO 클래스 내부에서 생성한 TodoDAO 인스턴스인 dao 반환
	// => getInstance 메소드를 통해서 해당 인스턴스를 얻을 수 있음
	public static TodoDAO getInstance() {
		return dao;
	}

}
