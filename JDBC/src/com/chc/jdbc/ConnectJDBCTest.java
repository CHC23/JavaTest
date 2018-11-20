package com.chc.jdbc;
//jdbc数据库连接测试

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBCTest {
	public static void main(String[] args) {
		Connection con=null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
			long start=System.currentTimeMillis();
			//建立连接
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", "root", "12zx13zc");
			long end=System.currentTimeMillis();
			System.out.println(con );
			System.out.println("建立连接耗时："+(end-start)+"毫秒");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
