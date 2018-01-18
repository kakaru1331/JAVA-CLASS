package a.b.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleHM {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		Map map = new HashMap();
		
		map.put("label", "»ï¼ºÀüÀÚ");
		map.put("product", "UHD-TV");
		map.put("price", 500000);
		list.add(map);
		
//		System.out.println(list);		
//		map = new HashMap();
		
		map.clear();
		map.put("label", "¿¤ÁöÀüÀÚ");
		map.put("product", "Æ®·Ò¼¼Å¹±â");
		map.put("price", 600000);
		list.add(map);
		
		System.out.println(list);

	}

}
