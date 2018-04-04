package a.b.c.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainController extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		doIt(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		doIt(req, res);
	}
	
	private void doIt(HttpServletRequest req, HttpServletResponse res) {
		System.out.println(req.getRequestURI());
		System.out.println(req.getParameter("menu"));
	}
}
