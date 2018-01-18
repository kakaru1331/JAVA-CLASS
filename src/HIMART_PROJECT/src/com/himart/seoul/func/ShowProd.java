package com.himart.seoul.func;

import com.himart.seoul.func.ext.Product;
import com.himart.seoul.func.intf.ProductIntf;

public class ShowProd extends Product implements ProductIntf {

	@Override
	public void doIt() throws Exception {
		super.print();
		
	}
	
}
