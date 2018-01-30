package com.himart.seoul.func;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.himart.seoul.db.Database;
import com.himart.seoul.func.ext.Product;
import com.himart.seoul.func.intf.ProductIntf;
import com.mysql.jdbc.PreparedStatement;

public class AddProd extends Product implements ProductIntf {

	public void doIt() throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("제조회사를 입력하세요.");
		String company = scan.nextLine();
		System.out.println("제품명을 입력하세요.");
		String name = scan.nextLine();
		System.out.println("가격을 입력하세요.");
		String price = scan.nextLine();
		
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/himart", "root", "1234");
			connection.setAutoCommit(false);
			
			String sql = "";
			sql += "INSERT INTO electronic (";
			sql += "	name";
			sql += "	,company";
			sql += "	,price";
			sql += ") VALUES (";
			sql += "	?";
			sql += "	,?";
			sql += "	,?";
			sql += ")";
			
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, company);
			ps.setInt(3, Integer.parseInt(price));
			
			System.out.println(ps.toString());
			int ret = ps.executeUpdate();
			System.out.println("리턴값:" + ret);
			if (1 == ret) {
				//커밋
				connection.commit();
				System.out.println("커밋");
			} else {
				//롤백
				connection.rollback();
				System.out.println("롤백");
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
