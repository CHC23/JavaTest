package com.chc.studentdemo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	
	private static Connection conn;
	
	//记载db驱动
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//创建数据库连接
	public static Connection getMySqlConnection() {
		String url="jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
		String user="root";
		String password="12zx13zc";
		
		try {
			if(conn==null) {
				conn=DriverManager.getConnection(url, user, password);
			}
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//关闭数据库
	
}
