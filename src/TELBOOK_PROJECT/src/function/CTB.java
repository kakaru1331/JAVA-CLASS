package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CTB {	
	Scanner scan = new Scanner(System.in);
	String name = null;
	String tell = null;
	String group = null;
	String sql = null;
	int ret = 0;
	
	String url = "jdbc:mysql://localhost:3306/tell_book";
	String user = "root";
	String password = "1234";
	
	Connection connection = null;
	PreparedStatement ps = null;	
	
	public void Create() {
		
		// 사용자 입력		
		name = null;
		tell = null;
		group = null;
		
		System.out.println("이름을 입력해주세요");
		name = scan.nextLine();
		
		System.out.println("전화번호를 입력해주세요");
		tell = scan.nextLine();
		
		System.out.println("그룹을 입력해주세요");
		group = scan.nextLine();
		
		// SQL				
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);
			
			sql = 
					"INSERT INTO tell_book ( "+
					"  name "+
					"  ,tel "+
					"  ,`group` "+
					") VALUES ( "+
					"  ?   "+
					"  ,?   "+
					"  ,?     "+
					") ";
					
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, name);			
			ps.setString(2, tell);
			ps.setString(3, group);		
			
			ret = ps.executeUpdate();
			System.out.println("return: " + ret);
			
						
			if (ret == 1) {
				connection.commit();
			} else {
				connection.rollback();
				System.out.println("Some error occured.");
			}
			
			ps.close();
			connection.close();
		
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if (connection != null) 
					connection.close();				
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
	}	
	
}
