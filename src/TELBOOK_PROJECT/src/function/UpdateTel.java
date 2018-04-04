package function;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTel {
	Scanner scan = new Scanner(System.in);	
	
	String id = null;
	String name = null;
	String tel = null;
	String group = null;
	String reg_date = null;
	String checking = null;	
	String sql = null;
	
	int ret = 0;
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void update(Connection connection) {				
		
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
			System.out.println("수정할 id를 입력해주세요.");
			id = scan.nextLine();
			
			sql = 
				"SELECT * "+
				"FROM tel_book "+
				"WHERE id = ? ";

			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			rs.next();
			name = rs.getString("name");
			tel = rs.getString("tel");
			group = rs.getString("group");	
			
			
			System.out.println("기존 이름: " + name);
			System.out.println("변경하실 건가요? [y/n]");					
			checking = scan.nextLine();	
			
			if (checking.equals("y")) {
				System.out.println("이름을 입력해주세요.");
				name = scan.nextLine();				
			}
			
			System.out.println("기존 번호: " + tel);
			System.out.println("변경하실 건가요? [y/n]");
			checking = scan.nextLine();
			
			if (checking.equals("y")) {
				System.out.println("번호를 입력해주세요.");
				tel = scan.nextLine();				
			}
			
			System.out.println("기존 그룹: " + group);
			System.out.println("변경하실 건가요? [y/n]");
			checking = scan.nextLine();
			
			if (checking.equals("y")) {
				System.out.println("그룹을 입력해주세요.");
				group = scan.nextLine();				
			}
			
			sql = 
				"UPDATE tel_book "+
				"SET name = ? "+
				"   ,tel = ? "+
				"   ,`group` = ? "+
				"WHERE id = ? ";
			
			ps = (PreparedStatement) connection.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, tel);
			ps.setString(3, group);
			ps.setString(4, id);
			ret = ps.executeUpdate();
			
			if (ret == 1) {
				connection.commit();
				System.out.println("===== 결과 =====");
				System.out.println(id + " | " + name + " | " + tel + " | " + group);
			} else {
				connection.rollback();
				System.out.println("음, 뭔가 오류가 발생했어요.");
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
