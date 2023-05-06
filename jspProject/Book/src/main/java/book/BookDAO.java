package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import book.util.BookDTO;

public class BookDAO {
	
	// DTO
	
	
	// SELECT 
	public List<BookDTO> selectByAll() {
		
		List<BookDTO> dtoList = null;
		BookDTO dto = null;
		
		// Connection // DriverManager
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.49:3306/project", "himedia", "tiger");
			
			// Statement
			
			PreparedStatement pstmt = conn.prepareStatement("select * from book");
			
			// ResultSet
			ResultSet rs = pstmt.executeQuery();
			
			// rs는 현재 0번지임
			
			dtoList = new ArrayList<>();
			
			while(rs.next()) {
//				rs.getInt("bookid");
//				rs.getString("bookname");
//				rs.getString("publisher");
//				rs.getString("price");
				
				dto = new BookDTO(rs.getInt("bookid"), rs.getString("bookname"), rs.getString("publisher"), rs.getString("price"));
				
				dtoList.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return dtoList;
	}
	// INSERT
	// DELETE
	// UPDATE
	
	public static void main(String[] args) {
		
		BookDAO book = new BookDAO();
		List<BookDTO> list = book.selectByAll();
		
		for(BookDTO val : list) {
			
			System.out.println(val);
			
		}
		
	}

}
