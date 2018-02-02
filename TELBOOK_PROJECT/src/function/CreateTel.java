package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateTel {
	Scanner scan = new Scanner(System.in);
	String name = null;
	String tel = null;
	String group = null;
	String sql = null;
	int ret = 0;	
	
	PreparedStatement ps = null;	
	
	public void create(Connection connection) {		
		System.out.println("이름을 입력해주세요");
		name = scan.nextLine();
		
		System.out.println("전화번호를 입력해주세요");
		tel = scan.nextLine();
		
		System.out.println("그룹을 입력해주세요");
		group = scan.nextLine();		
		
		try {			
			sql = 
					"INSERT INTO tel_book ( "+
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
			ps.setString(2, tel);
			ps.setString(3, group);
			ret = ps.executeUpdate();					
						
			if (ret == 1) {
				connection.commit();
				System.out.println("추가했어요!");
			} else {
				connection.rollback();
				System.out.println("음, 뭔가 오류가 발생했어요.");
			}
			
			ps.close();
		
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
		}
		
	}	
}
