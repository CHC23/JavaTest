package com.chc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//��װһЩ������,Ϊ�������ݿ�͹ر����ݿ��ṩ�ӿ�
public class JDBCTools {
	
	public static Connection getMySqlConnection() {
		
		try {
			//����������
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//��������
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", 
					"root", "12zx13zc");
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void close(Connection con,PreparedStatement ps,ResultSet rs) {
		//�ر����ݿ����ӣ���ѭ�ȿ����ԭ��
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
		//�ر����ݿ����ӣ���ѭ�ȿ����ԭ��
			
		try {
				if(con!=null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void close(Connection con,PreparedStatement ps) {
		//�ر����ݿ����ӣ���ѭ�ȿ����ԭ��
			
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
		//�ر����ݿ����ӣ���ѭ�ȿ����ԭ��
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
