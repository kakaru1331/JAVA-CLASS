package ch6;

public class Tester {

	public static void main(String[] args) {

		Person[] ps = new Person[100];
		CoffeeStore cs = new CoffeeStore();
		for (int i = 0; i < 100; i++) {
			ps[i] = new Person("ȫ"+i, 20 + i);
			ps[i].buy(cs);
		}
		System.out.println(ps);
	}

}
