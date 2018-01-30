package a.b.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/*System.out.println("hello world!");
		
		//ArrayList list1 = new ArrayList();
		list.add(1);
		list.add("ȫ�浿");
		list.add(false);
		System.out.println(list.get(1));
		
		for(int i = 1 ; i < 1001 ; i++) {
			list.add(i);
		}
		
		System.out.println();*/
		
		List list = new ArrayList();
		
		Person p = new Person("ȫ�浿", 20);
		list.add(p);
		
		System.out.println();
		
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			Object obj = ite.next();
			Person p2 = (Person)obj;
			System.out.println(p2.getName());
			System.out.println(p2.getAge());
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
