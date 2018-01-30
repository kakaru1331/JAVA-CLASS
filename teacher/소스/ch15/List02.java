package a.b.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class List02 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		Map map = new HashMap();
		map.put("name", "홍길동");
		map.put("age", 20);
		list.add(map);
		map = new HashMap();
		map.put("name", "이순신");
		map.put("age", 21);
		list.add(map);
		
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
