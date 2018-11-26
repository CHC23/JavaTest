package com.chc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//封装一些常用类,为连接数据库和关闭数据库提供接口
public class JDBCTools {
	
	public static Connection getMySqlConnection() {
		
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//建立连接
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", 
					"root", "12zx13zc");
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void close(Connection con,PreparedStatement ps,ResultSet rs) {
		//关闭数据库连接，遵循先开后闭原则。
			try {
				if(rs!=null) {
					rs.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		
			try {if(ps!=null) {
					ps.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		try {
				if(con!=null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(Connection con) {
		//关闭数据库连接，遵循先开后闭原则。
			
		try {
				if(con!=null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(Connection con,PreparedStatement ps) {
		//关闭数据库连接，遵循先开后闭原则。
			
			try {
				if(ps!=null) {
					ps.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		try {
				if(con!=null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(Connection con,ResultSet rs) {
		//关闭数据库连接，遵循先开后闭原则。
			try {
				if(rs!=null) {
					rs.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		
		try {
				if(con!=null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
