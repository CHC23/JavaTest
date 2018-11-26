package com.chc.jdbc;

/**
*PreparedStatement()方法用于发送带参数的sql语句
*与Statement()相比效率高   ，可防止sql注入
*相关方法：execute():运行语句，返回是否有结果集。
*		execute():运行select语句，返回ResultSet结果集
*		executeUpdate():进行insert，update，delete操作，返回更新的行数
*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementTest {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=JDBCTools.getMySqlConnection();
			
			String sql="insert into nbaplayer (name,age,position) values (?,?,?)";		//?：占位符
			ps=con.prepareStatement(sql);
			
			//参数索引从1开始的
			ps.setString(1,"保罗");
			ps.setString(2, "34");
			ps.setString(3, "控卫");
			
			
			//直接使用Object，不关心具体类型
			ps.setObject(1,"奥尼尔");
			ps.setObject(2,"46");
			ps.setObject(3,"中锋");
		
			ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.close(con, ps);
		}
	}
}
