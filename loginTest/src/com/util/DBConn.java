package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


//连接数据库
public class DBConn {
	static String url="jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
	static String username="root";
	static String password="12zx13zc";
	static Connection con=null;
	static ResultSet rs=null;
	static PreparedStatement ps=null;
	
	public static void init() {
		//初始化sql驱动
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		}catch(Exception e){
			System.out.println("sql驱动初始化失败");
			e.printStackTrace();
		}
	}
	
	public static int addUpdDel(String sql) {
		//sql增删改方法
		int i=0;
		try {
			ps=con.prepareStatement(sql);
			i=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println("sql增删改异常");
			e.printStackTrace();
		}
		return i;
	}
	
	public static ResultSet sqlSelest(String sql) {
		//数据库查询方法
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
		}catch(Exception e) {
			System.out.println("sql查询异常");
			e.printStackTrace();

		}
		
		return rs;
	}
	
	
	public static void sqlClose() {
		//关闭数据库
		try {
			con.close();
		}catch(Exception e) {
			System.out.println("sql关闭异常");
			e.printStackTrace();
		}
		
	}
}
