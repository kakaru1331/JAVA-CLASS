package a.b.c.user;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class MemberModel {
	
	public List selectMember(Map map) {
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs;
		List list = new ArrayList();		
		Map memberMap = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/himart", "root", "1234");
								
			String sql = "SELECT * ";
			sql += "FROM customer ";						
			
			ps = (PreparedStatement) connection.prepareStatement(sql);			
			rs = ps.executeQuery();				
			
			while (rs.next()) {
				memberMap = new HashMap();
				memberMap.put("name", rs.getString("name"));
				memberMap.put("age", rs.getString("age"));
				memberMap.put("gender", rs.getString("gender"));
				memberMap.put("reg_date", rs.getString("reg_date"));
				
				list.add(memberMap);
			}
			
//			if (rs.next()) {
//				map.put("result", "Y");
//				map.put("name", rs.getString("name"));
//			}			
			
			ps.close();
			rs.close();			
			connection.close();
			
			return list;
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
		return list;
	}
}
