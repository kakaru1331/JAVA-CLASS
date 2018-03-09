package a.b.c.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charSet=utf-8");
		
//		System.out.println("It's alive");
//		System.out.println(req.getRemoteAddr());
//		System.out.println(req.getRequestURI());
		
		PrintWriter out = res.getWriter();
		String docs = "<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <title>안녕!</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <h1>있니?</h1>\r\n" + 
				"</body>\r\n" + 
				"</html>";
		
		out.println(docs);
		
	}
	
}
