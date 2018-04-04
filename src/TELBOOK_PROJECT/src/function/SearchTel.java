package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchTel {

	Scanner scan = new Scanner(System.in);

	String menu = null;
	String name = null;
	String tel = null;
	String group = null;
	String sql = null;
	String tmpStr = null;

	Connection connection = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public void search(Connection connection) {

		menu = null;
		System.out.println("1. �̸����� ã��");
		System.out.println("2. ��ȭ��ȣ�� ã��");
		System.out.println("3. �׷����� ã��");
		menu = scan.nextLine();
		
		try {
			if (menu.equals("1")) {
				name = null;

				System.out.println("�̸��� �Է����ּ���");
				name = scan.nextLine();				
				
				tmpStr = "%";
				tmpStr += name + "%";
						
				sql = "SELECT * " + 
					"FROM tel_book " +
					"WHERE name LIKE ?";
				
				ps = (PreparedStatement) connection.prepareStatement(sql);
				ps.setString(1, tmpStr);				
				rs = ps.executeQuery();
				
				System.out.println("===== �˻� ��� =====");
				while(rs.next()) {
					name = rs.getString("name");
					tel = rs.getString("tel");
					group = rs.getString("group");
					
					System.out.println(name + " | " + tel + " | " + group);
				}
				
				rs.close();
				ps.close();				
			}

			if (menu.equals("2")) {
				tel = null;
				sql = null;

				System.out.println("��ȭ��ȣ�� �Է����ּ���");
				tel = scan.nextLine();
				
				tmpStr = "%";
				tmpStr += tel + "%";
						
				sql = "SELECT * " + 
					"FROM tel_book " +
					"WHERE tel LIKE ?";
				
				ps = (PreparedStatement) connection.prepareStatement(sql);
				ps.setString(1, tmpStr);
				
				System.out.println(ps);
				rs = ps.executeQuery();
				
				System.out.println("===== �˻� ��� =====");
				while(rs.next()) {
					name = rs.getString("name");
					tel = rs.getString("tel");
					group = rs.getString("group");
					
					System.out.println(name + " | " + tel + " | " + group);
				}
				
				rs.close();
				ps.close();	
			}

			if (menu.equals("3")) {
				group = null;
				sql = null;

				System.out.println("�׷��� �Է����ּ���");
				group = scan.nextLine();
				
				tmpStr = "%";
				tmpStr += name + "%";
						
				sql = "SELECT * " + 
					"FROM tel_book " +
					"WHERE group LIKE ?";
				
				ps = (PreparedStatement) connection.prepareStatement(sql);
				ps.setString(1, tmpStr);
				
				System.out.println(ps);
				rs = ps.executeQuery();
				
				System.out.println("===== �˻� ��� =====");
				while(rs.next()) {
					name = rs.getString("name");
					tel = rs.getString("tel");
					group = rs.getString("group");
					
					System.out.println(name + " | " + tel + " | " + group);
				}
				
				rs.close();
				ps.close();	
			}
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		} 
		
	}

}
