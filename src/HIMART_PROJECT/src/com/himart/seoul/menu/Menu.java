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
				System.out.println("메뉴를 선택하세요.");
				System.out.println("1. 목록 보기");
				System.out.println("2. 추가");
				System.out.println("3. 삭제");
				System.out.println("4. 수정");
				System.out.println("5. 종료");	
				
				String menu = scan.nextLine();
//				System.out.println("선택: " + menu);				
				
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
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}			
		} catch(Exception e) {
			System.out.println("에러");
			System.exit(0);
		}
		
	}
	
}
