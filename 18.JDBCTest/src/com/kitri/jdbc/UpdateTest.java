package com.kitri.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


// 현재 가입한 ID의 가입일을 현재시간으로 수정.
public class UpdateTest {

	public UpdateTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection makeConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.14.52:1521:orcl", "kitri", "kitri");
		return conn;
	}
	
	public static void main(String[] args) {
		UpdateTest ut = new UpdateTest();
		
		Connection conn = null;
		Statement stmt = null;
		
		String id = "Jaewoon Lee";
		int cnt = 0;
		
		try {
			conn = ut.makeConnection();
			
			String sql = "";
			sql += "update jdbctest ";
			sql += "set joindate = sysdate ";
			sql += "where id = '" + id + "'";
			
			stmt = conn.createStatement();
			
			cnt = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(cnt + "개 Data update success");
	}
}
