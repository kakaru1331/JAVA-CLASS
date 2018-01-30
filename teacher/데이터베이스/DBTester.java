package a.b.c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class DBTester {

	public static void main(String[] args) {
		Connection connection = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/himart", "root", "1234");
			st = (Statement) connection.createStatement();
			
			String input = "È«±æµ¿' OR 1 <> '";
			String sql = "SELECT * "
					+ "FROM customer "
					+ "WHERE name = '" + input + "'";
			System.out.println(sql);
			
//			String input = "È«±æµ¿' OR 1 <> '";
//			String sql = "SELECT * "
//				+ "FROM customer "
//				+ "WHERE name = ?";
//			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
//			ps.setString(1, input);
//			System.out.println(ps.toString());
//			ResultSet rs = ps.executeQuery();
			
//			String sql = ""
//					+"INSERT INTO customer ("
//					+"  name"
//					+"  ,age"
//					+"  ,gender"
//					+") VALUES ("
//					+"  'Å×½ºÅÍ03'"
//					+"  ,10"
//					+"  ,'M'"
//					+")";
//
//			connection.setAutoCommit(false);
			
			ResultSet rs = st.executeQuery(sql);
//			int ret = 0;
//			for (int i = 0 ; i < 100 ; i++) {
//				ret = st.executeUpdate(sql);
//				System.out.println(i);
//			}
//			ret = 2;
//			System.out.println("¸®ÅÏ°ª:" + ret);
//			if (1 == ret) {
//				//Ä¿¹Ô
//				connection.commit();
//				System.out.println("Ä¿¹Ô");
//			} else {
//				//·Ñ¹é
//				connection.rollback();
//				System.out.println("·Ñ¹é");
//			}

			while (rs.next()) {
				String name = rs.getString("name");
				System.out.println(name);
			}

			rs.close();
			st.close();
			connection.close();
		} catch (SQLException se1) {
			se1.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
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
