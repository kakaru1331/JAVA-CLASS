import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DBTester extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("You've got request!");
		print();
	}
	
	public void print() {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/himart", "root", "1234");
								
			String sql = "SELECT * "
				+ "FROM customer ";
			
			ps = (PreparedStatement) connection.prepareStatement(sql);			
			System.out.println(ps.toString());
			rs = ps.executeQuery();		
			
			System.out.println("========== 품목 ==========");
			while (rs.next()) {
				String c_seq = rs.getString("c_seq");
				String name = rs.getString("name");
				String age = rs.getString("age");
				String gender = rs.getString("gender");
				String reg_date = rs.getString("reg_date");
				
				System.out.println(c_seq + " | " + name + " | " + age + " | " + gender + " | " + reg_date);
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
	}
}