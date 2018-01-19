package com.bank.seoul.menu;

import java.util.Scanner;

import com.bank.seoul.user.Customer;

public class Menu {
	
	public void start() {
		Customer customer = new Customer(1000000);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 잔액 조회");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 종료");
			System.out.println("--------------------");
			
			String menu = scan.nextLine();
			
			if("1".equals(menu)) {
				System.out.println("--------------------");
				System.out.println("잔고: " + customer.getBalance());
				System.out.println("현금: " + customer.getCash());
				System.out.println("--------------------");
			}
			
			if("2".equals(menu)) {
				System.out.println("입금액을 입력하세요.");							
				customer.deposit(Integer.parseInt(scan.nextLine()));
			}
			
			if("3".equals(menu)) {
				System.out.println("출금액을 입력하세요.");
				customer.withdraw(Integer.parseInt(scan.nextLine()));
			}
			
			if("4".equals(menu)) {
				System.out.println("안녕히 가세요. ^^");
				System.exit(0);
			}
		}
		
	}
	
}
