package com.chc.mvcdemo.utils;
//数据库连接类

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcUtils {
	static String url="jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
	static String user="root";
	static String password="12zx13zc";
	static Connection conn=null;
	static ResultSet rs=null;
	static PreparedStatement ps=null;
	
	public static void getMySqlConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			System.out.println("数据库链接失败");
			e.printStackTrace();
		}
	}
	
	public static int addUpdDel(String sql){
		int i = 0;
		try {
			PreparedStatement ps =  conn.prepareStatement(sql);
			i =  ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql数据库增删改异常");
			e.printStackTrace();
		}
		
		return i;
	}
	public static ResultSet selectSql(String sql){
		try {
			ps =  conn.prepareStatement(sql);
			rs =  ps.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("sql数据库查询异常");
			e.printStackTrace();
		}
		return rs;
	}
	public static void closeConn(){
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("sql数据库关闭异常");
			e.printStackTrace();
		}
	}

}
