package main;

import java.util.Scanner;

import function.CTB;

public class TellBookMain {
	
	public static void main(String[] args) {
		
		CTB ctb = new CTB();
		Scanner scan = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("1. ��ȭ��ȣ�� ��ȸ");
				System.out.println("2. �߰�");
				System.out.println("5. ����");
				String menu = scan.nextLine();
				
				if (menu.equals("2")) {
					ctb.Create();
				}
				
				if (menu.equals("5")) {
					System.out.println("���μ��� ����");
					return;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
