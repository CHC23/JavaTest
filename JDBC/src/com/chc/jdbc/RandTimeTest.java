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
			con=JDBCTools.getMySqlConnection();
			
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
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {									//关闭数据库连接，遵循先开后闭原则。
			JDBCTools.close(con, ps, rs);
		}
	}
}
