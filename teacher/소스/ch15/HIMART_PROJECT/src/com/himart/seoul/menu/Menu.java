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
				System.out.println("�޴��� �����ϼ���.");
				System.out.println("1.��ü ��ǰ ����Ʈ");
				System.out.println("2.��ǰ �߰�");
				System.out.println("3.��ǰ ����");
				System.out.println("4.��ǰ ����");
				System.out.println("5.���α׷� ����");

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
					System.out.println("�����Դϴ�.");
				}
				if ("5".equals(menu)) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("������ ������ �߻��߽��ϴ�.");
			System.exit(0);
		}

	}

}
