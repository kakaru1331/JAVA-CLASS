package a.b.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ElectronicsTester {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Electronics("�Ｚ����", "UHD-TV", 500000));
		list.add(new Electronics("��������", "Ʈ�Ҽ�Ź��", 600000));
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Electronics elem = (Electronics) iterator.next();
			System.out.println(elem.getCompany() + " | " + elem.getProduct() + " | " + elem.getPrice());
		}
		System.out.println();
		
		List list2 = new ArrayList();
		Map map = new HashMap();
		
		map.put("company", "�Ｚ����");
		map.put("product", "UHD-TV");
		map.put("price", 500000);
		list2.add(map);
		
		map = new HashMap();
		map.put("company", "��������");
		map.put("product", "Ʈ�Ҽ�Ź��");
		map.put("price", 600000);
		list2.add(map);
		
		Iterator iterator2 = list2.iterator();
		while(iterator2.hasNext()) {
			HashMap key = (HashMap) iterator2.next();
			System.out.println(key.get("company") + "|" + key.get("product") + "|" + key.get("price"));
		}
		
		System.out.println();
	}
}
