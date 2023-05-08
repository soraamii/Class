package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.domain.TodoDTO;

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

	// TodoDTO 타입의 List를 반환하는 메소드

	// Connection => 데이터베이스와 연결을 담당하는 객체

	public List<TodoDTO> selectByAll(Connection conn) {

		// 변수 초기화 설정
		// sql을 수행할 PreparedStatement 객체 생성
		PreparedStatement pstmt = null;
		// ResultSet : 데이터베이스 쿼리 결과를 가리키는 커서 역할
		// select 쿼리문을 실행하면 결과 데이터가 ResultSet에 저장
		// => next() 메소드를 이용하여 다음 레코드로 이동, 각 레코드에 접근하기 위해 getXxx() 메소드 사용
		ResultSet rs = null;
		List<TodoDTO> list = null;

		// SQL
		String sql = "select * from tbl_todo";

		try {
			// pstmt를 생성시 sql 쿼리문이 컴파일되고 pstmt 반환
			// prepareStatement는 Connection 인터페이스에 정의된 메소드
			// => executeQuery()나 executeUpdate() 메소드를 호출
			pstmt = conn.prepareStatement(sql);

			// 결과 받기
			// 주로 select문 실행, ResultSet 객체 반환
			rs = pstmt.executeQuery();

			// list 인터페이스를 이용한 ArrayList 객체 생성
			list = new ArrayList<TodoDTO>();

			// rs(ResultSet)의 결과를 한 행씩 변수에 대입하여 추출
			while (rs.next()) {
				// rs(ResultSet)의 값을 추출하여 TodoDTO 객체를 만들고
//				int tno = rs.getInt("tno");
//				String todo = rs.getString("todo");
//				String duedate = rs.getString("duedate");
//				boolean finished = rs.getBoolean("finished");
//				
//				TodoDTO dto = new TodoDTO(tno, todo, duedate, finished)

				list.add(makeTodoDTO(rs));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;

	}
	
	// tno 값을 받아서 해당 Todo 정보(TodoDTO)를 반환하는 메소드
	public TodoDTO selectByTno(Connection conn, int tno) {
		
		// PreparedStatement : sql 수행할 객체
		PreparedStatement pstmt = null;
		// ResultSet : 결과값을 받을 객체
		ResultSet rs = null;
		// TodoDTO 변수 생성
		TodoDTO todo = null;
		
		// select sql
		// 값을 파라미터로 전달 => PreparedStatement의 setXXX() 메소드를 이용해 값 설정
		String sql = "select * from tbl_todo where tno = ?";
		
		
		try {
			// sql 쿼리문 연결
			pstmt = conn.prepareStatement(sql);
			// PreparedStatement 객체에 포함된 메소드 setXXX()
			// setInt(int parameterIndex, int x)
			pstmt.setInt(1, tno);
			
			// rs => 결과값 반환
			rs = pstmt.executeQuery();
			
			// if : 결과 행이 0 또는 1일 때
			// => tno는 PK이기 때문에 하나의 행만 출력 => 그래서 결과 값이 0 또는 1
			if(rs.next()) {
				todo = makeTodoDTO(rs);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				rs.close();
			}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return todo;
	}

	// rs -> TodoDTO 생성 => 반환
	// ResultSet의 결과를 한 행씩 한번에 추출하여 TodoDTO 객체를 만들어 내는 데 사용
	private TodoDTO makeTodoDTO(ResultSet rs) throws SQLException {

		return new TodoDTO(rs.getInt("tno"), 
				rs.getString("todo"), 
				rs.getString("duedate"), 
				rs.getBoolean("finished"));

	}

}
