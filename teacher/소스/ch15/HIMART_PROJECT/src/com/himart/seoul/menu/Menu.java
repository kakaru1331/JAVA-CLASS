package com.himart.seoul.menu;

import java.util.Scanner;

import com.himart.seoul.func.AddProd;
import com.himart.seoul.func.DelProd;
import com.himart.seoul.func.ShowProd;

public class Menu {

	public void start() {
		try {
			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("메뉴를 선택하세요.");
				System.out.println("1.전체 제품 리스트");
				System.out.println("2.제품 추가");
				System.out.println("3.제품 삭제");
				System.out.println("4.제품 수정");
				System.out.println("5.프로그램 종료");

				String menu = scan.nextLine();

				if ("1".equals(menu)) {
					new ShowProd().doIt();
				}
				if ("2".equals(menu)) {
					new AddProd().doIt();
				}
				if ("3".equals(menu)) {
					new DelProd().doIt();
				}
				if ("4".equals(menu)) {
					System.out.println("숙제입니다.");
				}
				if ("5".equals(menu)) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("실행중 에러가 발생했습니다.");
			System.exit(0);
		}

	}

}
