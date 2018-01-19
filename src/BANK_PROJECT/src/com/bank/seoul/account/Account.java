package com.bank.seoul.account;

public class Account {
	
	private String no = null;
	private String owner = null;
	private int balance = 0;
	
	public Account(String no, String owner, int balance) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;		
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getNo() {
		return no;
	}

	public String getOwner() {
		return owner;
	}
	
	
}
