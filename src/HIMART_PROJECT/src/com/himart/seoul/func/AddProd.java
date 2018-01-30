package com.himart.seoul.func;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.himart.seoul.func.ext.Product;
import com.himart.seoul.func.intf.ProductIntf;

public class AddProd extends Product implements ProductIntf {

	@Override
	public void doIt() throws Exception {		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ȸ�縦 �Է��ϼ���.");		
		String company = scan.nextLine();
		
		System.out.println("��ǰ���� �Է��ϼ���.");
		String name = scan.nextLine();
		
		System.out.println("������ �Է��ϼ���.");
		String price = scan.nextLine();
		
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/himart", "root", "1234");
			connection.setAutoCommit(false);
			
			String sql = 
					"INSERT INTO electronic ( "+
					"  name "+
					"  ,company "+
					"  ,price "+
					") VALUES ( "+
					"  ? "+
					"  ,? "+
					"  ,? "+
					") ";
			
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, company);
//			ps.setString(3, price);
			ps.setInt(3, Integer.parseInt(price));	
			
//			System.out.println(ps.toString());
			
			int ret = ps.executeUpdate();
			System.out.println("���ϰ�:" + ret);			
			if (1 == ret) {
				//Ŀ��
				connection.commit();
				System.out.println("Ŀ��");
			} else {
				//�ѹ�
				connection.rollback();
				System.out.println("�ѹ�");
			}			
			
			ps.close();
			connection.close();
			
		} catch (SQLException se1) {
			se1.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException se2) {
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
//		Map map = new HashMap();
//		map.put("company", company);
//		map.put("product", product);
//		map.put("price", price);
//		Database.list.add(map);
		
		super.print();
	}
	
}
