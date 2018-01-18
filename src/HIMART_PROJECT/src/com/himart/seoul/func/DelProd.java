package com.himart.seoul.func;

import java.util.Scanner;

import com.himart.seoul.db.Database;
import com.himart.seoul.func.ext.Product;
import com.himart.seoul.func.intf.ProductIntf;

public class DelProd extends Product implements ProductIntf {

	@Override
	public void doIt() throws Exception {
		Scanner scan = new Scanner(System.in);
		
		super.print();
		System.out.println("������ ��ǰ ��ȣ�� �Է��ϼ���.");
		String idx = scan.nextLine();
		Database.list.remove(Integer.parseInt(idx) - 1);
		
		super.print();
	}
	
}
