package com.kitri.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionTest {

	public ConnectionTest() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loding completed.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// URL : Protocol + ip + port : ½Äº°ÀÚ
	private void dbConnect() {
		try {
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.14.52:1521:orcl", "kitri", "kitri");
			System.out.println("DataBase connection completed.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ConnectionTest ct = new ConnectionTest();
		ct.dbConnect();
	}
}
