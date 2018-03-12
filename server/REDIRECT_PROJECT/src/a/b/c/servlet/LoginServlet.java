package a.b.c.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		System.out.println("POST 입장");
//		
//		System.out.println(req.getParameter("id"));
//		System.out.println(req.getParameter("pw"));
		
//		Enumeration<String> params = req.getParameterNames();
//		while(params.hasMoreElements()) {
//			String param = params.nextElement();
////			System.out.println(param);
////			System.out.println(req.getParameter(param));
//			System.out.println(param + ": " + req.getParameter(param));
//		}
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		// nullPointerException 방지
		if (!"".equals(id) && "kakaru".equals(id)) {
			if ("123".equals(pw)) {
//				res.sendRedirect("/main");
				res.sendRedirect("http://google.ca");				
			}
			else
				System.out.println("비밀번호를 확인해보세요.");
				PrintWriter out = res.getWriter();
				out.println("Password error.");
		} else {
			System.out.println("누구세요?");
			PrintWriter out = res.getWriter();
			out.println("ID error.");
		}
	}
}
