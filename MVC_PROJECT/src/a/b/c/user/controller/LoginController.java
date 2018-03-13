package a.b.c.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a.b.c.user.model.LoginModel;

public class LoginController extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		String msg = req.getParameter("msg");		
		req.setAttribute("msg", LoginModel.concatStr(msg));
		RequestDispatcher rd  = req.getRequestDispatcher("/view/user/login.jsp");
		try {
			rd.forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
