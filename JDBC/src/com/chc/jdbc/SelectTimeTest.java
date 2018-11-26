package com.chc.jdbc;
//取出数据库中指定日期的数据

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class SelectTimeTest {
	
	public static long strDate(String dateStr) {
		//把日期字符串格式转换为long型数字格式
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		try {
			return format.parse(dateStr).getTime();
		}catch(ParseException e){
			e.printStackTrace();
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JDBCTools.getMySqlConnection();
			
			ps=con.prepareStatement("select * from nbaplayer where loginTime>? and loginTime<? order by loginTime");
			
			Timestamp startTime=new Timestamp(strDate("2018-11-22 20:20:00"));
			Timestamp endTime=new Timestamp(strDate("2018-11-22 20:30:00"));
			ps.setObject(1,startTime);
			ps.setObject(2,endTime);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"  "+rs.getString("name")+"  "+rs.getString("position")+"  "+rs.getTimestamp("loginTime"));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {									//关闭数据库连接，遵循先开后闭原则。
		JDBCTools.close(con, ps, rs);
		}
	}
		
		
}
