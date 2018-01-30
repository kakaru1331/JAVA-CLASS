package com.bank.seoul.user;

import com.bank.seoul.shinhan.Shinhan;

public class Customer {
	
	private Shinhan sh = new Shinhan();
	private int cash = 0;
	
	public Customer(int cash) {
		this.cash = cash;
		sh.openAccount("123-456-789", "ȫ�浿", 0);
	}
	
	public void inBank(int money) {
		sh.saveMoney(money);
		this.cash -= money;
	}
	
	public void outBank(int money) {
		this.cash += sh.withdraw(money);
	}
	
	public int getBalance() {
		return sh.getMyBalance();
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
	

}
