package a.b.c.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.b.c.auth.LoginController;
import a.b.c.user.MemberController;

public class MainServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		doPost(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {		
		try {			
			String uri = req.getRequestURI();
			
			System.out.println(uri);
			
			if ("/loginP.do".equals(uri)) {
				String page = new LoginController(req).process(uri);				
//				System.out.println("page: " + page);				
				req.getRequestDispatcher(page).forward(req, res);
			}
			
			if ("/login.do".equals(uri)) {
				String page = new LoginController(req).process(uri);
				req.getRequestDispatcher(page).forward(req, res);
			}
			
			if ("/selectMember.do".equals(uri)) {
				String page = new MemberController(req).process(uri);
				req.getRequestDispatcher(page).forward(req, res);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
