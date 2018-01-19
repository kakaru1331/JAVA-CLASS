package com.bank.seoul.menu;

import java.util.Scanner;

import com.bank.seoul.user.Customer;

public class Menu {
	
	public void start() {
		Customer customer = new Customer(1000000);
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------------");
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. �ܾ� ��ȸ");
			System.out.println("2. �Ա�");
			System.out.println("3. ���");
			System.out.println("4. ����");
			System.out.println("--------------------");
			
			String menu = scan.nextLine();
			
			if("1".equals(menu)) {
				System.out.println("--------------------");
				System.out.println("�ܰ�: " + customer.getBalance());
				System.out.println("����: " + customer.getCash());
				System.out.println("--------------------");
			}
			
			if("2".equals(menu)) {
				System.out.println("�Աݾ��� �Է��ϼ���.");							
				customer.deposit(Integer.parseInt(scan.nextLine()));
			}
			
			if("3".equals(menu)) {
				System.out.println("��ݾ��� �Է��ϼ���.");
				customer.withdraw(Integer.parseInt(scan.nextLine()));
			}
			
			if("4".equals(menu)) {
				System.out.println("�ȳ��� ������. ^^");
				System.exit(0);
			}
		}
		
	}
	
}
