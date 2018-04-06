package a.b.c.board.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

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
				
		model.addAttribute("parameter", req.getParameter("q"));
		
		return "board/list";
	}
}
