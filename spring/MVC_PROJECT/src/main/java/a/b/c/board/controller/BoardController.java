package a.b.c.board.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author kakaru
 *
 */

@Controller
public class BoardController {
		
	/**
	 * 
	 * @param model
	 * @return 게시판 목록 페이지
	 */
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public String list(Model model, HttpServletRequest req) {		
		
		return "board/list";
	}
	
	@RequestMapping(value="/board/writeP", method=RequestMethod.GET)
	public String writeP(Model model, HttpServletRequest req) {		
		
		return "board/writeP";
	}
	
	@RequestMapping(value="/board/write", method=RequestMethod.POST)
	public String write(Model model, HttpServletRequest req) {		
		String postTitle = req.getParameter("title");
		String postDescription = req.getParameter("description");
		
		Map<String, String> post = new HashMap();
		post.put("title", postTitle);
		post.put("description", postDescription);
		
		HttpSession session = req.getSession();		
		List<Map> postList = (List) session.getAttribute("postList");
		if (postList == null) {
			postList = new ArrayList();			
			session.setAttribute("postList", postList);
		}
		postList.add(post);
		session.setAttribute("postList", postList);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/board/detail", method=RequestMethod.GET)
	public String detail(Model model, HttpServletRequest req) {		
		
		return "board/detail";
	}
	
	@RequestMapping(value="/board/modifyP", method=RequestMethod.GET)
	public String modifyP(Model model, HttpServletRequest req) {		
		HttpSession session = req.getSession();
		List<Map> postList = (List<Map>) session.getAttribute("postList");
		
		int index = Integer.parseInt(req.getParameter("index"));	
		model.addAttribute("post", postList.get(index));
		
		return "board/modifyP";
	}
	
	@RequestMapping(value="/board/modify", method=RequestMethod.POST)
	public String modify(Model model, HttpServletRequest req) {		
		String postTitle = req.getParameter("title");
		String postDescription = req.getParameter("description");
		
		Map<String, String> post = new HashMap();
		post.put("title", postTitle);
		post.put("description", postDescription);
		
		HttpSession session = req.getSession();		
		List<Map> postList = (List) session.getAttribute("postList");
		int index = Integer.parseInt(req.getParameter("index"));	
		
		postList.set(index, post);		
		session.setAttribute("postList", postList);
		
		return "redirect:/board/detail?index=" + index;
	}
	
	@RequestMapping(value="/board/delete", method=RequestMethod.GET)
	public String delete(Model model, HttpServletRequest req) {		
		HttpSession session = req.getSession();
		List<Map> postList = (List<Map>) session.getAttribute("postList");
		
		int index = Integer.parseInt(req.getParameter("index"));	
		postList.remove(index);
		session.setAttribute("postList", postList);
		
		return "redirect:/board/list";
	}
	
}
