package a.b.c.auth;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class LoginModel {
	
	public Map checkAuth(Map map) {
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs;
		
		map.put("result", "N");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/himart", "root", "1234");
								
			String sql = "SELECT * ";
			sql += "FROM customer ";
			sql += "WHERE name = ? ";
			sql += "AND age = ?";			
			
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, (String)map.get("id"));
			ps.setString(2, (String)map.get("pw"));
			rs = ps.executeQuery();			
			
			if (rs.next()) {				
				Map info = new HashMap();
				info.put("c_seq", rs.getString("c_seq"));				
				info.put("name", rs.getString("name"));
				
				map.put("result", "Y");
				map.put("userInfo", info);
			}			
			
			ps.close();
			rs.close();			
			connection.close();
			
			return map;
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
		return map;
	}
}
