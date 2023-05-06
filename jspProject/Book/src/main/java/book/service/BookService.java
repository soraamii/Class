package book.service;

// 컨트롤러랑 DAO 연결

import java.util.List;

import book.BookDAO;
import book.util.BookDTO;

public class BookService {

	
	public List<BookDTO> selectService() {
		
		BookDAO book = new BookDAO();
		List<BookDTO> list = book.selectByAll();
		
		return list;
	}
}
