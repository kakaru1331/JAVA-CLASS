package coffee.impl;

import coffee.ext.Drip;
import coffee.itfc.Coffee;

public class Espresso extends Drip implements Coffee {
	
	private String name = "Espresso";

	@Override
	public String checkCoffeOrigin() {
		return name + "-원산지:베트남";
	}
	
	@Override
	public String dripBrew() {
		return super.drip(name);
	}
}
