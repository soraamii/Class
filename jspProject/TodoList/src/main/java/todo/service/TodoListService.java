package todo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import todo.util.ConnectionProvider;

public class TodoListService {
	
	// TodoDAO 타입 변수 생성
	
	TodoDAO dao;
	
	// TodoDAO의 dao 변수 가져오기
	
	private TodoListService() {
		this.dao = TodoDAO.getInstance();
	}
	
	// 인스턴스 생성
	private static TodoListService service = new TodoListService();
	
	// service를 반환하는 public 메소드 생성
	public static TodoListService getInstance() {
		return service;
	}
	
	// list 메소드
	public List<TodoDTO> getList() {
		
		Connection conn = null;
		List<TodoDTO> list = null;
		
		try {
			// 데이터베이스 연결
			conn = ConnectionProvider.getConnection();
			
			// 모든 데이터 가져오기
			list = dao.selectByAll(conn);

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		}
		
		return list;
		
	}

}
