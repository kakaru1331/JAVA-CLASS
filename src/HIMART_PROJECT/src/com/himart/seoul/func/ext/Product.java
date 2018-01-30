package com.himart.seoul.func.ext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Product {
	
	public void print() {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/himart", "root", "1234");
								
			String sql = "SELECT * "
				+ "FROM electronic ";
			
			ps = (PreparedStatement) connection.prepareStatement(sql);			
			System.out.println(ps.toString());
			rs = ps.executeQuery();		
			
			System.out.println("========== 前格 ==========");
			while (rs.next()) {
				String e_seq = rs.getString("e_seq");
				String name = rs.getString("name");
				String company = rs.getString("company");
				String price = rs.getString("price");
				String reg_date = rs.getString("reg_date");
				
				System.out.println(e_seq + " | " + name + " | " + company + " | " + price + " | " + reg_date);
			}
			
			ps.close();
			rs.close();			
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
		
		
//		System.out.println("========== 前格 ==========");
//		Iterator iterator = Database.list.iterator();
//		int i = 1;
//		
//		while(iterator.hasNext()) {
//			HashMap map = (HashMap) iterator.next();
//			System.out.println(i + "." + map.get("company") + " | " + map.get("product") + " | " + map.get("price"));
//			i++;
//		}
//		System.out.println("========== 前格 ==========");
	}
	
}
