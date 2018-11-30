package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


//�������ݿ�
public class DBConn {
	static String url="jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
	static String username="root";
	static String password="12zx13zc";
	static Connection con=null;
	static ResultSet rs=null;
	static PreparedStatement ps=null;
	
	public static void init() {
		//��ʼ��sql����
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		}catch(Exception e){
			System.out.println("sql������ʼ��ʧ��");
			e.printStackTrace();
		}
	}
	
	public static int addUpdDel(String sql) {
		//sql��ɾ�ķ���
		int i=0;
		try {
			ps=con.prepareStatement(sql);
			i=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("sql��ɾ���쳣");
			e.printStackTrace();
		}
		return i;
	}
	
	public static ResultSet sqlSelest(String sql) {
		//���ݿ��ѯ����
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
		}catch(Exception e) {
			System.out.println("sql��ѯ�쳣");
			e.printStackTrace();

		}
		
		return rs;
	}
	
	
	public static void sqlClose() {
		//�ر����ݿ�
		try {
			con.close();
		}catch(Exception e) {
			System.out.println("sql�ر��쳣");
			e.printStackTrace();
		}
		
	}
}
