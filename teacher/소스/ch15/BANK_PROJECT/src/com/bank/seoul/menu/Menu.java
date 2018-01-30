package com.bank.seoul.menu;

import java.util.Scanner;

import com.bank.seoul.user.Customer;

public class Menu {
	
	public void start() {
		Customer ct = new Customer(1000000);
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.잔액 조회");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.프로그램 종료");

			String menu = scan.nextLine();
			
			if("1".equals(menu)) {
				System.out.println("잔고 :" + ct.getBalance() +", 현금 : " + ct.getCash());
			}
			if("2".equals(menu)) {
				System.out.println("입금 금액을 입력하세요.");
				ct.inBank(Integer.parseInt(scan.nextLine()));
			}
			if("3".equals(menu)) {
				System.out.println("출금 금액을 입력하세요.");
				ct.outBank(Integer.parseInt(scan.nextLine()));
			}
			if("4".equals(menu)) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			
			
			
			
		}
		
		
		
		
	}

}
