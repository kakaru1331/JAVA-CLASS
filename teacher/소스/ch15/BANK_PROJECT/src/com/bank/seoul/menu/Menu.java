package com.bank.seoul.menu;

import java.util.Scanner;

import com.bank.seoul.user.Customer;

public class Menu {
	
	public void start() {
		Customer ct = new Customer(1000000);
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1.�ܾ� ��ȸ");
			System.out.println("2.�Ա�");
			System.out.println("3.���");
			System.out.println("4.���α׷� ����");

			String menu = scan.nextLine();
			
			if("1".equals(menu)) {
				System.out.println("�ܰ� :" + ct.getBalance() +", ���� : " + ct.getCash());
			}
			if("2".equals(menu)) {
				System.out.println("�Ա� �ݾ��� �Է��ϼ���.");
				ct.inBank(Integer.parseInt(scan.nextLine()));
			}
			if("3".equals(menu)) {
				System.out.println("��� �ݾ��� �Է��ϼ���.");
				ct.outBank(Integer.parseInt(scan.nextLine()));
			}
			if("4".equals(menu)) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			
			
			
			
		}
		
		
		
		
	}

}
