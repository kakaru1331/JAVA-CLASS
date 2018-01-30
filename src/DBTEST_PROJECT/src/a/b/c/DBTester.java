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
			ResultSet rs;
			
//			String sql;

//			sql = "SELECT * "
//				+ "FROM customer";
			
//			rs = st.executeQuery(sql);
			
//			while (rs.next()) {
//			String name = rs.getString("name");
//			String age = rs.getString("age");
//			System.out.println("이름: " + name);
//			System.out.println("나이: " + age);
//		}
			
//			sql = ""
//					+"INSERT INTO customer ("
//					+"   name"
//					+"  ,age"
//					+"  ,gender"  
//					+") VALUES ("
//					+"  'Tester03'"  
//					+"  ,30"
//					+"  ,'M'" 
//					+")";
//			connection.setAutoCommit(false);
//			int ret = 0;
//			for(int i = 0; i < 100; i++) {
//				ret = st.executeUpdate(sql);
//				System.out.println(i);
//			}
//			ret = 2;
//			System.out.println("반환값: " + ret);
//			if(ret == 1) {
//				//commit
//				connection.commit();
//				System.out.println("Commited.");
//			} else {
//				//rollback
//				connection.rollback();
//				System.out.println("Rollback");
//			}
			/*주:	executeUpdate는 affected row count를 반환
			 *		commit 또는 rollback 판단에 유용 
			 * */

//			String input = "홍길동' OR 1 <> '";
//			String sql = "SELECT * "
//					+ "FROM customer "
//					+ "WHERE name = '" + input + "'";
//			System.out.println(sql);
			/*sql injection 
			 * 당하기 딱 좋음. 
			 * 사용하지 않는 것이 바람직.*/
			
			String input = "홍길동' OR 1 <> '";
			String sql = "SELECT * "
				+ "FROM customer "
				+ "WHERE name = ?";
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, input);
			System.out.println(ps.toString());
			rs = ps.executeQuery(); 
			
			// 닫을 땐 반대 순서로
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
