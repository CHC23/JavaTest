package com.chc.jdbc;
//jdbc数据库连接测试

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBCTest {
	public static void main(String[] args) {
		Connection con=null;
		try {
			con=JDBCTools.getMySqlConnection();
			long start=System.currentTimeMillis();
			long end=System.currentTimeMillis();
			System.out.println(con );
			System.out.println("数据库连接成功，建立连接耗时："+(end-start)+"毫秒");
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.close(con);
		}
	}
}
