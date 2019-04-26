package com.kitri.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertTest {

	public InsertTest() {
		try {
//			1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot find OracleDriver");
		}
	}
	
	
	public Connection makeConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.14.52:1521:orcl", "kitri", "kitri");
		return conn;
	}
	
	public static void main(String[] args) {
		InsertTest it = new InsertTest();
		
		Connection conn = null;
		Statement stmt = null;
		
		String name = "ÀÌÀç¿î";
		String id = "Jaewoon Lee";
		int cnt = 0;
				
		try {
//			2.
			conn = it.makeConnection();
			
//			3.
			String sql = "";
			sql += "insert into jdbctest (no, name, id, joindate) ";
			sql += "values (jdbctest_no_seq.nextVal, '" + name + "', '" + id + "', sysdate)";
			
			stmt = conn.createStatement();
			
//			4.
			cnt = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			5.
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
		
		if (cnt != 0) {
			System.out.println("Data insert success");
		} else {
			System.out.println("Data insert fail");
		}
	}
}
