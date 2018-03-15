package a.b.c.auth;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class LoginController {
	
	private HttpServletRequest req;
	
	public LoginController(HttpServletRequest req) {
		this.req = req;
	}
	
	public String process(String uri) {
		
		if ("/loginP.do".equals(uri)) {
			return "/view/auth/loginP.jsp";
		}
		
		if ("/login.do".equals(uri)) {	
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			Map map = new HashMap();
			map.put("id", id);
			map.put("pw", pw);
			
			// park / 25
			Map result = new LoginModel().checkAuth(map);
			
			if ("Y".equals(result.get("result"))) {
				req.setAttribute("msg", "Y");
				req.setAttribute("name", result.get("name"));
				return "/view/auth/result.jsp";
			} else {
				req.setAttribute("msg", "N");				
				return "/view/auth/result.jsp";
			}

		}		
		return "/";
	}
}
