package com.himart.seoul.menu;

import java.util.Scanner;

import com.himart.seoul.func.AddProd;
import com.himart.seoul.func.DelProd;
import com.himart.seoul.func.EditProd;
import com.himart.seoul.func.ShowProd;

public class Menu {
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("�޴��� �����ϼ���.");
				System.out.println("1. ��� ����");
				System.out.println("2. �߰�");
				System.out.println("3. ����");
				System.out.println("4. ����");
				System.out.println("5. ����");	
				
				String menu = scan.nextLine();
//				System.out.println("����: " + menu);				
				
				if(menu.equals("1")) {
					new ShowProd().doIt();					
				}
				if(menu.equals("2")) {
					new AddProd().doIt();					
				}
				if(menu.equals("3")) {
					new DelProd().doIt();					
				}
				if(menu.equals("4")) {
					new EditProd().doIt();					
				}
				if(menu.equals("5")) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}			
		} catch(Exception e) {
			System.out.println("����");
			System.exit(0);
		}
		
	}
	
}
