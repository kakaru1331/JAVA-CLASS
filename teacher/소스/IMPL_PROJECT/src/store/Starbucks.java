package store;

import java.util.ArrayList;
import java.util.List;

import coffee.impl.Americano;
import coffee.impl.Espresso;
import coffee.impl.Latte;
import coffee.itfc.Coffee;
import coffee.itfc.Milk;

public class Starbucks {

	public static void main(String[] args) {

		Coffee c1 = new Americano();
		Coffee c2 = new Espresso();
		Coffee c3 = new Latte();

		List list = new ArrayList();
		list.add(c1);
		list.add(c2);
		list.add(c3);

		for (Object obj : list) {
			System.out.println(((Coffee) obj).checkCoffeOrigin());
			if (obj instanceof Milk) {
				System.out.println(((Milk) obj).checkMilkQuantity());
			}
			System.out.println(((Coffee) obj).dripBrew());
			System.out.println("---------------------");
		}
	}

}
