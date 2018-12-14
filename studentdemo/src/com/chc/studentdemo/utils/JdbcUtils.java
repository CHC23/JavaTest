package com.chc.studentdemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
	
	private static Connection conn;
	
	//����db����
//	static {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
	//�������ݿ�����
	public static Connection getMySqlConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
		String user="root";
		String password="12zx13zc";
		
		
		if(conn==null || conn.isClosed()) {
			conn=DriverManager.getConnection(url, user, password);
		}
		return conn;
		
	}
	
	//�ر����ݿ�
	public static void close(Connection conn,Statement ps,ResultSet rs) throws SQLException {

			if(conn!=null && !conn.isClosed()) {
				conn.close();
			}
			if(ps!=null && !ps.isClosed()) {
				ps.close();
			}
			if(rs!=null && !rs.isClosed()) {
				rs.close();
			}
	
	}
}
