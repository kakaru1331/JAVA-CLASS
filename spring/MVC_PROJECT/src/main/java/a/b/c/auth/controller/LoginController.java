package a.b.c.auth.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/auth/loginP", method=RequestMethod.GET)
	public String loginP() {
		
		return "auth/loginP";
	}
	
	@RequestMapping(value="/auth/login", method=RequestMethod.POST)
	public String login(HttpServletRequest req, 
			@RequestParam("id") String id,
			@RequestParam("password") String pw,
			@RequestParam("hobby") List hobbies,			
			HttpSession session) {
		
//		String inputID = req.getParameter("id");
//		String inputPassword = req.getParameter("password");
		String inputID = id;
		String inputPassword = pw;
		Boolean authenticateResult;		
		
		authenticateResult = authenticate(inputID, inputPassword);		
		if (authenticateResult) {
//			HttpSession session = req.getSession();
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
