package main;

import java.util.Scanner;

import function.CTB;

public class TellBookMain {
	
	public static void main(String[] args) {
		
		CTB ctb = new CTB();
		Scanner scan = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("1. 전화번호부 조회");
				System.out.println("2. 추가");
				System.out.println("5. 종료");
				String menu = scan.nextLine();
				
				if (menu.equals("2")) {
					ctb.Create();
				}
				
				if (menu.equals("5")) {
					System.out.println("프로세스 종료");
					return;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
