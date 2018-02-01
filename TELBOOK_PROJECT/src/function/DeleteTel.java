package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTel {

	Scanner scan = new Scanner(System.in);

	String id = null;
	String name = null;
	String tel = null;
	String group = null;
	String reg_date = null;
	String checking = null;

	String sql = null;

	PreparedStatement ps = null;
	ResultSet rs = null;

	public void delete(Connection connection) {				
		
		try {								
			sql = "SELECT * "
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
			
			System.out.println("========== 목록 끝 ==========");
			System.out.println();
			System.out.println("삭제할 id를 입력해주세요.");
			id = scan.nextLine();			
			
			ps = null;
			rs = null;
			
			sql = 
				"SELECT * "+
				"FROM tel_book "+
				"WHERE id = ? ";
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, id);
			System.out.println(ps);
			rs = ps.executeQuery();
			System.out.println(rs);
			
			rs.next();
			name = rs.getString("name");
			tel = rs.getString("tel");
			group = rs.getString("group");
			
			System.out.println("확인해주세요");
			System.out.println(name + " | " + tel + " | " + group);
			System.out.println("삭제하실 거예요?: [y/n]");
			checking = scan.nextLine();
			
			if (checking.equals("y")) {				
				ps = null;
				
				sql = 
					"DELETE  "+
					"FROM tel_book "+
					"WHERE id = ? ";

				ps = (PreparedStatement) connection.prepareStatement(sql);
				ps.setString(1, id);				
				ps.executeUpdate();				
				
				System.out.println("해당 정보를 삭제했습니다.");
			} else {
				System.out.println("맞아요, 지우긴 좀 아깝죠~");
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
