package function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadTel {		
	String id = null;
	String name = null;
	String tel = null;
	String group = null;
	String reg_date = null;
	
	String sql = null;
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void read(Connection connection) {				
		
		try {		
								
			String sql = "SELECT * "
				+ "FROM tel_book ";
			
			ps = (PreparedStatement) connection.prepareStatement(sql);
			rs = ps.executeQuery();		
			
			System.out.println("========== 전화번호부 ==========");
			while (rs.next()) {
				id = rs.getString("id");
				name = rs.getString("name");
				tel = rs.getString("tel");
				group = rs.getString("group");
				reg_date = rs.getString("reg_date");
				
				System.out.println(id + " | " + name + " | " + tel + " | " + group + " | " + reg_date);
			}
			
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
