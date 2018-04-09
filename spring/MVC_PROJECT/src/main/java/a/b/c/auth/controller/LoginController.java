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
		String inputID = req.getParameter("id");
		String inputPassword = req.getParameter("password");
		Boolean authenticateResult;		
		
		authenticateResult = authenticate(inputID, inputPassword);		
		if (authenticateResult) {
			HttpSession session = req.getSession();
			session.setAttribute("isLogin", "true");
			session.setAttribute("id", inputID);
			
			return "redirect:/main";			
		}  
		
		return "auth/loginP";		
	}
	
	@RequestMapping(value="/auth/logout", method=RequestMethod.GET)
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.removeAttribute("isLogin");		
		
		return "redirect:/main";
	}
	
	public boolean authenticate(String id, String password) {
		if ("kakaru".equals(id)) {
			if ("1234".equals(password))
				return true;			
		}
		
		return false;
	}
	
}
