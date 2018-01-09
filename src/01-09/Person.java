package ch6;

public class Person {
	
	private String name = null;
	private int age = 0;
	private int money = 50000;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void buy(CoffeeStore cs) {
		this.money = cs.sell(money);
		System.out.println("커피를 샀어요." + this.money);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}
