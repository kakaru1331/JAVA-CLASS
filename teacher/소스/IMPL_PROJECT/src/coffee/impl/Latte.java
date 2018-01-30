package coffee.impl;

import coffee.ext.Drip;
import coffee.itfc.Coffee;
import coffee.itfc.Milk;

public class Latte extends Drip implements Coffee, Milk {
	
	private String name = "Latte";

	@Override
	public String checkMilkQuantity() {
		return name + "-우유량:250ml";
	}

	@Override
	public String checkCoffeOrigin() {
		return name + "-원산지:인도네시아";
	}

	@Override
	public String dripBrew() {
		return super.drip(name);
	}
}
