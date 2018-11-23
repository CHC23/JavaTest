package com.chc.jdbc;

/**
 * 测试事务的基本概念
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class TransactionTest {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		ResultSet rs=null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//建立连接
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", 
					"root", "12zx13zc");
			con.setAutoCommit(false);			//默认是true，自动提交事务，这里改为手动提交
			
			ps1=con.prepareStatement("insert into nbaplayer (name,age,position) values (?,?,?)");
			ps1.setObject(1, "乔治");		
			ps1.setObject(2, "29");	
			ps1.setObject(3, "小前锋");
			ps1.execute();
			System.out.println("事务一操作成功");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ps2=con.prepareStatement("insert into nbaplayer (name,age,position) values (?,?,?)");
			ps2.setObject(1, "易建联");		
			ps2.setObject(2, "31");
			//ps2.setObject(3, "大前锋");
			ps2.execute();						//这里会报错，此事务提交失败，事务会回滚到事务一提交前，即两个事物都未提交成功
			System.out.println("事务二操作成功");
			
			con.commit();			//手动提交事务
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}					//事务二提交失败，到这里会回滚到所有的事务未提交的状态
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {									//关闭数据库连接，遵循先开后闭原则。
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
	
					e.printStackTrace();
				}
			}
			if(ps1!=null) {
				try {
					ps1.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps2!=null) {
				try {
					ps2.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
