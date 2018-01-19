package com.bank.seoul.user;

import com.bank.seoul.shinhan.Shinhan;

public class Customer {
	
	private Shinhan shinhan = new Shinhan();
	private int cash = 0;
	
	public Customer(int cash) {
		this.cash = cash;
		shinhan.openAccount("111", "Jack", 0);
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}
	
	public void deposit(int money) {
		if(cash < money) {
			System.out.println("���� �����ؿ�.");
		} else {
			shinhan.deposit(money);
			this.cash -= money;
		}
	}
	
	public void withdraw(int money) {
		int balance = shinhan.getMyBalance();
		
		if(balance < money) {
			System.out.println("�ܰ� �����ؿ�.");
		} else {
			shinhan.withdraw(money);
			this.cash += money;
		}
	}
	
	public int getBalance() {
		return shinhan.getMyBalance();
	}
	
}
