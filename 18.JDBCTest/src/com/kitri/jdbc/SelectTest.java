package com.kitri.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.List;


public class SelectTest {

	public SelectTest() {
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
	
	private List<MemberDto> memberList(String searchName) {
		List<MemberDto> list = new ArrayList<MemberDto>();
		
		Connection conn = null;
		Statement stmt = null;
		// count(*) : 1  rs.next();
		// 0/1			 if (rs.next()) {}
		// 여러개			 while (rs.next()) {}
		ResultSet rs = null;
		
		try {
			conn = makeConnection();
			
			String sql = "";
			sql += "select no, name, id, joindate \n";
			sql += "from jdbctest \n";
			if (searchName != null) {
				sql += "where name = '" + searchName + "'";
			}
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberDto memberDto = new MemberDto();
//				memberDto.setNo(rs.getInt(1));
				memberDto.setNo(rs.getInt("no"));
				memberDto.setId(rs.getString("id"));
				memberDto.setName(rs.getString("name"));
				memberDto.setJoindate(rs.getString("joindate"));
				
				list.add(memberDto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (stmt != null) {
					rs.close();
				}
				
				if (conn != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	private MemberDto memberSearch(int no) {
		MemberDto member = null;		
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = makeConnection();
			
			String sql = "";
			sql += "select no, id, name, ";
			sql += "decode(to_char(joindate, 'yymmdd'), to_char(sysdate, 'yymmdd'), to_char(joindate, 'hh24:mi:ss'), to_char(joindate, 'yy.mm.dd')) joindate \n";
			sql += "from jdbctest \n";
			sql += "where no = " + no;
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				member = new MemberDto();
				
				member.setNo(rs.getInt("no"));
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setJoindate(rs.getString("joindate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (stmt != null) {
					rs.close();
				}
				
				if (conn != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return member;
	}
	
	public static void main(String[] args) {
		SelectTest st = new SelectTest();

		String searchName = null;
		List<MemberDto> list = st.memberList(searchName);
		
		System.out.println("회원번호\t\t이름\t\t아이디\t\t가입일");
		System.out.println("-----------------------");
		
		for(MemberDto memberDto : list) {
			System.out.println(memberDto.getNo() + "\t\t" + memberDto.getName() + "\t\t" + memberDto.getId() + "\t\t" + memberDto.getJoindate());
		}
		
		System.out.println();
		
//		int no = 10;
		int no = 201;
		MemberDto member = st.memberSearch(no);
		
		if (member != null) {
			System.out.println("이름 : " + member.getName());
			System.out.println("ID : " + member.getId());
			System.out.println("가입일 : " + member.getJoindate());
		} else {
			System.out.println(no + "번 회원은 존재하지 않습니다.");
		}
	}
}
