package todo.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.TodoDTO;
import todo.service.TodoListService;


@WebServlet("/todo/list")

// HttpServlet 클래스를 상속 받음 -> HTTP 요청을 처리하는 기능
public class TodoListController extends HttpServlet {
	
	// TodoListService 객체 생성
	TodoListService listService;
	
	// TodoListService.getInstance();
	// -> TodoListService 클래스의 싱글톤 인스턴스를 반환하는 정적 메소드
	// => service
	public TodoListController() {
		this.listService = TodoListService.getInstance();
	}
	
	
	// 화면에 리스트를 출력 : get 방식의 요청
	// 브라우저의 url 창에 입력해서 요청 -> get
	
	// doGet() 메소드 오버라이딩
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 사용자 요청 분석
		// 2. Service에 요청 -> 응답 데이터 반환
		
		List<TodoDTO> list = listService.getList();
		
		// 3. 응답 데이터를 request의 속성에 저장 : view로 데이터 전달
		// request.setAttribute(name, value)
		request.setAttribute("todoList", list);
		
		// 쿠키 설정
		// 1. Cookie 객체 생성
		// Cookie cookie = new Cookie("cookieName", "cookieValue");

		Cookie cookie = new Cookie("uname", "cool");
		// 2. response.addCookie(쿠키 객체);
		response.addCookie(cookie);
		
		// 4. view 지정 -> forward
		// viewPath 변수에 포워딩할 JSP 파일 경로 저장
		String viewPath = "/WEB-INF/views/todo/list.jsp";
		// RequestDispatcher : 서블릿에서 다른 서블릿, JSP 페이지 또는 웹 애플리케이션의 자원으로 요청을 전달하는 인터페이스
		// 인자로는 요청을 전달할 대상의 URL 또는 절대경로 지정
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		// forward() : 현재 요청 객체와 응답 객체를 지정된 URL에 있는 JSP 파일이나 서블릿으로 전달
		dispatcher.forward(request, response);
	
	}
	
}
