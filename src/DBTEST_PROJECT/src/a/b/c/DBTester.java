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
//			System.out.println("�̸�: " + name);
//			System.out.println("����: " + age);
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
//			System.out.println("��ȯ��: " + ret);
//			if(ret == 1) {
//				//commit
//				connection.commit();
//				System.out.println("Commited.");
//			} else {
//				//rollback
//				connection.rollback();
//				System.out.println("Rollback");
//			}
			/*��:	executeUpdate�� affected row count�� ��ȯ
			 *		commit �Ǵ� rollback �Ǵܿ� ���� 
			 * */

//			String input = "ȫ�浿' OR 1 <> '";
//			String sql = "SELECT * "
//					+ "FROM customer "
//					+ "WHERE name = '" + input + "'";
//			System.out.println(sql);
			/*sql injection 
			 * ���ϱ� �� ����. 
			 * ������� �ʴ� ���� �ٶ���.*/
			
			String input = "ȫ�浿' OR 1 <> '";
			String sql = "SELECT * "
				+ "FROM customer "
				+ "WHERE name = ?";
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, input);
			System.out.println(ps.toString());
			rs = ps.executeQuery(); 
			
			// ���� �� �ݴ� ������
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
