package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTel {
	Scanner scan = new Scanner(System.in);	
	
	String id = null;
	String name = null;
	String tel = null;
	String group = null;
	String reg_date = null;
	String checking = null;
	
	String sql = null;
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void update(Connection connection) {				
		
		try {		
								
			sql = "SELECT * "
				+ "FROM tel_book ";
			
			ps = (PreparedStatement) connection.prepareStatement(sql);
			rs = ps.executeQuery();		
			
			System.out.println("========== ��ȭ��ȣ�� ==========");
			while (rs.next()) {
				id = rs.getString("id");
				name = rs.getString("name");
				tel = rs.getString("tel");
				group = rs.getString("group");
				reg_date = rs.getString("reg_date");
				
				System.out.println(id + " | " + name + " | " + tel + " | " + group + " | " + reg_date);				
			}
			
			System.out.println("========== ��� �� ==========");
			System.out.println();
			System.out.println("������ id�� �Է����ּ���.");
			id = scan.next();
			
			sql = null;
			id = null;
			
			sql = 
				"SELECT * "+
				"FROM tel_book "+
				"WHERE id = ? ";
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			name = rs.getString("name");
			tel = rs.getString("tel");
			group = rs.getString("group");
			
//			System.out.println("Ȯ�����ּ���");
//			System.out.println(name + " | " + tel + " | " + group);
//			System.out.println("�����Ͻ� �ſ���?: [y/n]");
//			checking = scan.nextLine();
			
//			if (checking.equals("y")) {
//				sql = 
//			}
			

			
			
			ps.close();
			rs.close();			
			
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
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			
		}
	}
}
