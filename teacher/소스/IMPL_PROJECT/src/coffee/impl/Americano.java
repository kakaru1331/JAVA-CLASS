package coffee.impl;

import coffee.ext.Drip;
import coffee.itfc.Coffee;

public class Americano extends Drip implements Coffee {
	
	private String name = "Americano";

	@Override
	public String checkCoffeOrigin() {
		return name + "-원산지:브라질";
	}

	@Override
	public String dripBrew() {
		return super.drip(name);
	}
	

}
