package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import function.CreateTel;
import function.DeleteTel;
import function.ReadTel;
import function.SearchTel;
import function.UpdateTel;

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
		UpdateTel updateTel = new UpdateTel();
		DeleteTel deleteTel = new DeleteTel();
		
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
				System.out.println("3. 검색");
				System.out.println("4. 수정");
				System.out.println("5. 삭제");
				System.out.println("6. 종료");
				String menu = scan.nextLine();
				
				if (menu.equals("1")) {
					readTel.read(connection);
					System.out.println();
				}
				
				if (menu.equals("2")) {
					createTel.create(connection);
					System.out.println();
				}
				
				if (menu.equals("3")) {
					searchTel.search(connection);
					System.out.println();
				}
				
				if (menu.equals("4")) {
					updateTel.update(connection);
					System.out.println();
				}
				
				if (menu.equals("5")) {
					deleteTel.delete(connection);
					System.out.println();
				}
				
				if (menu.equals("6")) {
					System.out.println("프로세스 종료");
					return;
				}
			}
			
			 
			/* # 할 일
			 * 1. 메소드 앞글자 소문자 변경*/
			
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
