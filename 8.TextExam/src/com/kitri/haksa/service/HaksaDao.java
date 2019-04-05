package com.kitri.haksa.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kitri.haksa.data.HaksaDto;


public class HaksaDao {
	
	public HaksaDao() {
		
	}
	
	
	public void register(HaksaDto haksa) {
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@192.168.14.32:1521:orcl", "kitri", "kitri");
			
			ps = c.prepareStatement("insert into haksa_main(name, age, job_code, job_value) values(?,?,?,?)");
			
			ps.setString(1, haksa.getName());
			ps.setInt(2, haksa.getAge());
			ps.setInt(3, haksa.getKey());
			ps.setString(4, haksa.getValue());
			
			ps.executeUpdate();
			ps.close();
			
			ps = c.prepareStatement("select job_name from job_table where job_code = (select job_code from haksa_main where name = (?))");
			
			ps.setString(1, haksa.getName());
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				haksa.setKeyName(rs.getString("job_name"));
			}
			
			System.out.println("등록되었습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	
	public HaksaDto findName(String name) {
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		HaksaDto haksaDto = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@192.168.14.32:1521:orcl", "kitri", "kitri");
			
			ps = c.prepareStatement("select job_name from job_table where job_code = (select job_code from haksa_main where name = (?))");
			
			ps.setString(1, name);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				haksaDto = new HaksaDto();
				
				haksaDto.setKeyName(rs.getString("job_name"));
			}
			
			rs.close();
			ps.close();
			
			ps = c.prepareStatement("select * from haksa_main where name = (?)");
			
			ps.setString(1, name);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				haksaDto.setAge(rs.getInt("age"));
				haksaDto.setName(rs.getString("name"));
				haksaDto.setKey(rs.getInt("job_code"));
				haksaDto.setValue(rs.getString("job_value"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return haksaDto;
	}
	
	public int delete(String name) {
		Connection c = null;
		PreparedStatement ps = null;
		
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@192.168.14.32:1521:orcl", "kitri", "kitri");
			
			ps = c.prepareStatement("delete from haksa_main where name = (?)");
			
			ps.setString(1, name);
			
			result = ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return result;
	}
	
	public ArrayList<HaksaDto> selectAllList() {
		ArrayList<HaksaDto> list = new ArrayList<HaksaDto>();
		
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		HaksaDto haksaDto = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@192.168.14.32:1521:orcl", "kitri", "kitri");
			
			ps = c.prepareStatement("select age, name, h.job_code \"job_code\", job_value, j.job_name \"job_name\" from haksa_main h, job_table j where h.job_code = j.job_code");
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				haksaDto = new HaksaDto();
				
				haksaDto.setAge(rs.getInt("age"));
				haksaDto.setName(rs.getString("name"));
				haksaDto.setKey(rs.getInt("job_code"));
				haksaDto.setValue(rs.getString("job_value"));
				haksaDto.setKeyName(rs.getString("job_name"));
				
				list.add(haksaDto);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return list;
	}
}
