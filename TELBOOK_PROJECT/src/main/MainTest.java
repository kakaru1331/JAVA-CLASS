package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import function.CreateTel;
import function.ReadTel;
import function.SearchTel;

public class MainTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/tel_book";
		String user = "root";
		String password = "1234";
		Connection connection = null;
		
		CreateTel createTel = new CreateTel();		
		ReadTel readTel = new ReadTel();
		SearchTel searchTel = new SearchTel();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			while(true) {
				System.out.println("1. ��ȸ");
				System.out.println("2. �߰�");
				System.out.println("3. �˻�");
				System.out.println("5. ����");
				String menu = scan.nextLine();
				
				if (menu.equals("1")) {
					readTel.read(connection);
				}
				
				if (menu.equals("2")) {
					createTel.create(connection);
				}
				
				if (menu.equals("3")) {
					searchTel.search(connection);
				}
				
				if (menu.equals("5")) {
					System.out.println("���μ��� ����");
					return;
				}
			}
			
			 
			/* # �� ��
			 * 1. �޼ҵ� �ձ��� �ҹ��� ����*/
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
