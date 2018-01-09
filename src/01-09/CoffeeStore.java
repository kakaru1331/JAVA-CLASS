package ch6;

public class CoffeeStore {
	
	int coffeeCount = 100;
	
	int sell(int money) {
		this.coffeeCount--;
		System.out.println("아메리카노를 팔았어요." + this.coffeeCount);
		return money-5000;
	}
	
	
	
}
