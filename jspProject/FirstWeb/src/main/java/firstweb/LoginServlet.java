package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		////////////////////////////////////////
		// 사용자 요청 처리

		String id = request.getParameter("id");
		System.out.println("사용자 입력 id : " + id);

		String password = request.getParameter("password");
		System.out.println("사용자 입력 PW : " + password);

		////////////////////////////////////////
		// 응답 처리

		PrintWriter out = response.getWriter();

		out.println("id : " + id);
		out.println("PW : " + password);
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		////////////////////////////////////////
		// 사용자 요청 처리

		String id = request.getParameter("id");
		System.out.println("사용자 입력 id : " + id);

		String password = request.getParameter("password");
		System.out.println("사용자 입력 PW : " + password);

		////////////////////////////////////////
		// 응답 처리

		PrintWriter out = response.getWriter();

		out.println("id : " + id);
		out.println("PW : " + password);
		out.close();

	}

}
