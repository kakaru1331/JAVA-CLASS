package com.himart.seoul.func.ext;

import java.util.HashMap;
import java.util.Iterator;

import com.himart.seoul.db.Database;

public class Product {
	
	public void print() {
		
		Iterator ite = Database.list.iterator();
		System.out.println("전체 제품 리스트");
		int i = 1;
		while(ite.hasNext()) {
			HashMap map = (HashMap)ite.next();
			System.out.println((i++) +"."+ map.get("company")+"|"+map.get("product")+"|"+map.get("price"));
		}
		
	}
	
}
