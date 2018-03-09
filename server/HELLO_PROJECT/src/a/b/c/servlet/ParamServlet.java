package a.b.c.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
//		System.out.println(req.getParameter("id"));
		
		String[] ids = req.getParameterValues("id");
		for (int i=0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
	}
	
}
