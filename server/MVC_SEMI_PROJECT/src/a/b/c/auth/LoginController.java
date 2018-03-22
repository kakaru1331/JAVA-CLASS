package a.b.c.auth;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

public class LoginController {
	
	private HttpServletRequest req;
	
	public LoginController(HttpServletRequest req) {
		this.req = req;
	}
	
	public String process(String uri) {
		
		if ("/loginP.do".equals(uri)) {
			return "/view/auth/loginP.jsp";
		}
		
		if ("/logout.do".equals(uri)) {
			req.getSession().invalidate();
			
			return "/view/auth/loginP.jsp";
		}
		
		if ("/login.do".equals(uri)) {	
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			Map map = new HashMap();
			map.put("id", id);
			map.put("pw", pw);
			
			Map result = new LoginModel().checkAuth(map);
			
			if ("Y".equals(result.get("result"))) {
				// userInfo -> key: c_seq, id, name 				
				Map userInfo = (Map)map.get("userInfo");
				
				HttpSession session = req.getSession();
				session.setAttribute("userInfo", userInfo);
				
//				req.setAttribute("msg", "Y");
//				req.setAttribute("name", userInfo.get("name"));
				
				return "/view/auth/result.jsp";
			} else {
//				req.setAttribute("msg", "N");		
				
				return "/view/auth/result.jsp";
			}

		}		
		return "/";
	}
}
