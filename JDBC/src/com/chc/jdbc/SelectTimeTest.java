package com.chc.jdbc;
//ȡ�����ݿ���ָ�����ڵ�����

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
		//�������ַ�����ʽת��Ϊlong�����ָ�ʽ
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
			//����������
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//��������
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", 
					"root", "12zx13zc");
			
			ps=con.prepareStatement("select * from nbaplayer where loginTime>? and loginTime<? order by loginTime");
			
			Timestamp startTime=new Timestamp(strDate("2018-11-22 20:20:00"));
			Timestamp endTime=new Timestamp(strDate("2018-11-22 20:30:00"));
			ps.setObject(1,startTime);
			ps.setObject(2,endTime);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+"  "+rs.getString("name")+"  "+rs.getString("position")+"  "+rs.getTimestamp("loginTime"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {									//�ر����ݿ����ӣ���ѭ�ȿ����ԭ��
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
