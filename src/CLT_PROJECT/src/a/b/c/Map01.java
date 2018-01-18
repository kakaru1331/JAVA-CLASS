package a.b.c;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		
		/*
		map.put(1, "Messi");
		map.put(2, "Son");
		
		Object obj = map.get(2);
		String name = (String) obj;
		
		System.out.println(name);*/
		
		Map map = new HashMap();
		Person p1 = new Person("Ronaldo", 34);
		Person p2 = new Person("Xavi", 39);
		map.put("hou", p1);
		map.put("tiki", p2);
		
		Set keyset = map.keySet();
		keyset.iterator();
		
		Object obj1 = map.get("hou");
		Person p3 = (Person) obj1;
		
		Object obj2 = map.get("tiki");
		Person p4 = (Person) obj2;
		
		System.out.println("Name: " + p3.getName() + " | Age: " + p3.getAge());
		System.out.println("Name: " + p4.getName() + " | Age: " + p4.getAge());
		
		
		
	}

}
