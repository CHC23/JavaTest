package com.chc.student.utils;
/*
 * 数据库工具类
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcUtils {
	
		private static Connection conn;
		
		public static Connection getMySqlConnection() {
			String url="jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
			String user="root";
			String password="12zx13zc";
			
			try {
				//加载驱动
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				//创建连接
				if(conn==null||conn.isClosed()) {
					conn=DriverManager.getConnection(url, user, password);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return conn;
		}
		
		public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
			//关闭数据库连接，遵循先开后闭原则。
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
}
