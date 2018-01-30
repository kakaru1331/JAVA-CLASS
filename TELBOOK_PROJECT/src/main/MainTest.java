package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import function.CreateTel;
import function.ReadTel;

public class MainTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String url = "jdbc:mysql://localhost:3306/tel_book";
		String user = "root";
		String password = "1234";
		Connection connection = null;
		
		CreateTel createTel = new CreateTel();		
		ReadTel readTel = new ReadTel();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			while(true) {
				System.out.println("1. 조회");
				System.out.println("2. 추가");
				System.out.println("5. 종료");
				String menu = scan.nextLine();
				
				if (menu.equals("1")) {
					readTel.Read(connection);
				}
				
				if (menu.equals("2")) {
					createTel.Create(connection);
				}
				
				if (menu.equals("5")) {
					System.out.println("프로세스 종료");
					return;
				}
			}
			
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
