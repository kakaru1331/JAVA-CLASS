package com.himart.seoul.func.ext;

import java.util.HashMap;
import java.util.Iterator;

import com.himart.seoul.db.Database;

public class Product {
	
	public void print() {
		
		System.out.println("========== 前格 ==========");
		Iterator iterator = Database.list.iterator();
		int i = 1;
		
		while(iterator.hasNext()) {
			HashMap map = (HashMap) iterator.next();
			System.out.println(i + "." + map.get("company") + " | " + map.get("product") + " | " + map.get("price"));
			i++;
		}
		System.out.println("========== 前格 ==========");
	}
	
}
