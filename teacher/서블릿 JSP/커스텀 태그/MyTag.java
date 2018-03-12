package a.b.c.tag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag extends SimpleTagSupport {
	
	private int number = 0;
	
	public void setNumber(int number) {
		this.number = number;
	}

	public void doTag() {
		try {
			JspWriter jw = getJspContext().getOut();
			if (0 == number % 2) {
				jw.print("<h1>Â¦¼ö</h1>");
			} else {
				jw.print("<h1>È¦¼ö</h1>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
