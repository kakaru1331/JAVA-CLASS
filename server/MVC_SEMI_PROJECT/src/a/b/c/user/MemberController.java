package a.b.c.user;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class MemberController {
	
	private HttpServletRequest req = null;
	
	public MemberController(HttpServletRequest req) {
		this.req = req;
	}
	
	public String process(String uri) {
		if ("/selectMember.do".equals(uri)) {
			List memberList = new MemberModel().selectMember(new HashMap());
			req.setAttribute("memberList", memberList);
			return "/view/user/userList.jsp";
		}
		
		return "/";
	}
}
