package a.b.c.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("It worked well!");
		
		req.setAttribute("msg", "hello, there~");
		req.getRequestDispatcher("/user/loginP.jsp").forward(req, res);
	}
	
	
}
