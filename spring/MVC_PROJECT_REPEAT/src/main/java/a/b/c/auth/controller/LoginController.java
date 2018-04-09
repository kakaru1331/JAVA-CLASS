package a.b.c.auth.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/auth/loginP", method=RequestMethod.GET)
	public String loginP() {
		
		return "auth/loginP";
	}
	
	@RequestMapping(value="/auth/login", method=RequestMethod.POST)
	public String login(HttpServletRequest req) {		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		if ("kdhong".equals(id) && "1234".equals(pw)) {
			HttpSession session = req.getSession();
			session.setAttribute("userID", id);
			
			return "redirect:/main";
		}
		
		return "auth/loginP";
	}
	
	@RequestMapping(value="/auth/logout", method=RequestMethod.GET)
	public String logout(HttpServletRequest req) {		
		req.getSession().invalidate();
		
		return "redirect:/main";
	}
	
	
	
}
