package com.bank.seoul.shinhan;

import java.util.ArrayList;
import java.util.List;

import com.bank.seoul.account.Account;

public class Shinhan {
	
	private List<Account> accountList = new ArrayList<>();
	
	public void openAccount(String no, String owner, int balance) {
		accountList.add(new Account(no, owner, balance));
	}	
	
	public void deposit(int money) {
		Account account = accountList.get(0);
		account.setBalance(account.getBalance() + money);
	}
	
	public int withdraw(int money) {
		Account account = accountList.get(0);
		int balance = account.getBalance();
		
		if(balance < money) {
			System.out.println("잔액이 부족합니다.");
			return account.getBalance();
		} else {
			account.setBalance(balance - money);
			return account.getBalance();
		}
	}
	
	public int getMyBalance() {
		Account account = accountList.get(0);
		return account.getBalance();
	}
	
}
