package a.b.c;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		
		/*
		map.put(1, "ȫ�浿");
		map.put(2, "�̼���");
		
		Object obj = map.get(2);
		String str = (String)obj;
		
		System.out.println(str);*/
		
		Map map = new HashMap();
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("�̼���", 21);
		map.put("hkd1234", p1);
		map.put("lss5678", p2);
		
		Set ks = map.keySet();
		
		Object obj = map.get("lss5678");
		Person p = (Person)obj;
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
