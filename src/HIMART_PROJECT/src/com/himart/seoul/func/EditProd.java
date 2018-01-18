package com.himart.seoul.func;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.himart.seoul.db.Database;
import com.himart.seoul.func.ext.Product;
import com.himart.seoul.func.intf.ProductIntf;

public class EditProd extends Product implements ProductIntf {

	@Override
	public void doIt() throws Exception {		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수정할 품목의 번호를 입력하세요.");
		String prodNum = scan.nextLine();
		int idx = Integer.parseInt(prodNum);
		
		
		System.out.println("제조 회사를 입력하세요.");		
		String company = scan.nextLine();
		
		System.out.println("제품명을 입력하세요.");
		String product = scan.nextLine();
		
		System.out.println("가격을 입력하세요.");
		String price = scan.nextLine();
		
		Map map = new HashMap();
		map.put("company", company);
		map.put("product", product);
		map.put("price", price);
		Database.list.set(idx-1, map);
		
		super.print();
	}
	
}
