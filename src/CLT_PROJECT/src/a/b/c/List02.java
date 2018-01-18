package a.b.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List02 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		Map map = new HashMap();
		
		map.put("name", "Son");
		map.put("age", 27);
		list.add(map);		
		
		map = new HashMap();
//		map.clear();
		map.put("name", "Bruyne");
		map.put("age", 28);
		list.add(map);
		
		System.out.println();
		
		

	}

}
