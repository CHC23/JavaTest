package com.chc.jdbc;


//���ݿ��������������

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
			//����������
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//��������
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", 
					"root", "12zx13zc");
			
			for(int i=0;i<1000;i++) {
				String sql="insert into nbaplayer (name,age,position,loginTime) values (?,?,?,?)";
				ps=con.prepareStatement(sql);
			
				int randTime=12345678+new Random().nextInt(87654321);
				Timestamp stamp=new Timestamp(System.currentTimeMillis()-randTime);
				ps.setObject(1, "�ǵ�"+i);
				ps.setObject(2, "54");
				ps.setObject(3,"����");
				ps.setObject(4,stamp);
				ps.execute();
				
			}
			System.out.println("����ɹ�");	
			
			
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
