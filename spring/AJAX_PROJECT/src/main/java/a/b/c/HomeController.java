package a.b.c;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	public static int count = 0;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/vote", method = RequestMethod.POST)
	@ResponseBody
	public String vote(@RequestParam Map map) {		
		String type = (String)map.get("type");	

		if ("1".equals(type))
			count++;
		else
			count--;
		
		return Integer.toString(count);
	}
	
	@RequestMapping(value="/vote2", method = RequestMethod.POST)	
	public String vote2(@RequestParam Map map, Model model) {		
		String type = (String)map.get("type");	

		if ("1".equals(type))
			count++;
		else
			count--;
		
		model.addAttribute("count", count);
		
		return "part";
	}
	
	@RequestMapping(value="/vote3", method = RequestMethod.POST)
	@ResponseBody
	public String vote3(@RequestParam Map map, Model model) {		
		String type = (String)map.get("type");	

		if ("1".equals(type))
			count++;
		else
			count--;
		
//		model.addAttribute("count", count);
		
		JsonObject jo = new JsonObject();
		jo.addProperty("result", "1");
		jo.addProperty("data", count);
		jo.addProperty("error", "IOException");
		
		return new Gson().toJson(jo);
	}
}
