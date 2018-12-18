package com.chc.student.utils;
/*
 * ���ݿ⹤����
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
				//��������
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				//��������
				if(conn==null||conn.isClosed()) {
					conn=DriverManager.getConnection(url, user, password);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return conn;
		}
		
		public static void close(Connection conn,PreparedStatement ps,ResultSet rs) {
			//�ر����ݿ����ӣ���ѭ�ȿ����ԭ��
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
