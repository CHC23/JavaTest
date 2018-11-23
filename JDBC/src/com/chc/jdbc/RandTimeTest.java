package com.chc.jdbc;


//数据库中生成随机日期

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Random;

public class RandTimeTest {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//加载驱动类
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//建立连接
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", 
					"root", "12zx13zc");
			
			for(int i=0;i<1000;i++) {
				String sql="insert into nbaplayer (name,age,position,loginTime) values (?,?,?,?)";
				ps=con.prepareStatement(sql);
			
				int randTime=12345678+new Random().nextInt(87654321);
				Timestamp stamp=new Timestamp(System.currentTimeMillis()-randTime);
				ps.setObject(1, "乔丹"+i);
				ps.setObject(2, "54");
				ps.setObject(3,"分卫");
				ps.setObject(4,stamp);
				ps.execute();
				
			}
			System.out.println("插入成功");	
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
			if(ps!=null) {
				try {
					ps.close();
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
