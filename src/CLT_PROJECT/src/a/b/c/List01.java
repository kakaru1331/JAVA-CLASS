package a.b.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
//		System.out.println("Hello, world!");
		
//		ArrayList list1 = new ArrayList();
		List list = new ArrayList();
		/*list.add(1);
		list.add("Son");
		list.add(false);
		
		System.out.println(list.get(1));
		
		for(int i = 0; i < 1000; i++) {
			list.add(i);
		}
		System.out.println();*/
		
		Person p1 = new Person("Park", 38);
		list.add(p1);
		
		System.out.println();
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			Person p = (Person) obj;		
					
			System.out.println(p.getName());
			System.out.println(p.getAge());
		}
		
		
	}

}
