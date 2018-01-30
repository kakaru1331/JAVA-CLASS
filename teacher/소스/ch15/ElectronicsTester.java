package a.b.c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ElectronicsTester {

	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add(new Electronic("»ï¼ºÀüÀÚ", "UHD-TV", 500000));
//		list.add(new Electronic("¿¤ÁöÀüÀÚ", "Æ®·Ò¼¼Å¹±â", 600000));
//		
//		Iterator ite = list.iterator();
//		while(ite.hasNext()) {
//			Electronic et = (Electronic)ite.next();
//			System.out.println(et.getCompany()+"|"+et.getProduct()+"|"+et.getPrice());
//		}
		
		List list = new ArrayList();
		Map map = new HashMap();
		map.put("company", "»ï¼ºÀüÀÚ");
		map.put("product", "UHD-TV");
		map.put("price", 500000);
		list.add(map);
		map = new HashMap();
		map.put("company", "¿¤ÁöÀüÀÚ");
		map.put("product", "Æ®·Ò¼¼Å¹±â");
		map.put("price", 600000);
		list.add(map);
		
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			HashMap et = (HashMap)ite.next();
			System.out.println(et.get("company")+"|"+et.get("product")+"|"+et.get("price"));
		}
		
		
		
		
		
		
		
		
	}

}
