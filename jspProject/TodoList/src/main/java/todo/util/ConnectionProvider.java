package todo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	// 데이터베이스에 연결
	
	public static Connection getConnection() throws SQLException {
		
		// DB URL
		String dbUrl = "jdbc:mysql://localhost:3306/project";
		return DriverManager.getConnection(dbUrl, "himedia", "tiger");
	}
	
	// 제대로 데이터베이스 연결이 되었는지 확인하는 용도
	public static void main(String[] args) throws SQLException {
		System.out.println(ConnectionProvider.getConnection());
	}

}
