package com.bank.seoul.shinhan;

import java.util.ArrayList;
import java.util.List;

import com.bank.seoul.account.Account;

public class Shinhan {
	
	private List acntList = new ArrayList();

	public void openAccount(String no,String owner,int balance) {
		acntList.add(new Account(no,owner,balance));
	}
	
	public void saveMoney(int money) {
		Account acnt = (Account)acntList.get(0);
		acnt.setBalance(acnt.getBalance() + money);
	}
	
	public int withdraw(int money) {
		Account acnt = (Account)acntList.get(0);
		acnt.setBalance(acnt.getBalance() - money);
		return money;
	}
	
	public int getMyBalance() {
		Account acnt = (Account)acntList.get(0);
		return acnt.getBalance();
	}
	
	
	
	
	
	
	
	
	

}
