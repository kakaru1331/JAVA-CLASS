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
		System.out.println("�̸��� �Է����ּ���");
		name = scan.nextLine();
		
		System.out.println("��ȭ��ȣ�� �Է����ּ���");
		tel = scan.nextLine();
		
		System.out.println("�׷��� �Է����ּ���");
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
				System.out.println("�߰��߾��!");
			} else {
				connection.rollback();
				System.out.println("��, ���� ������ �߻��߾��.");
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
