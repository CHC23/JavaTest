package com.chc.jdbc;
//jdbc���ݿ����Ӳ���

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBCTest {
	public static void main(String[] args) {
	
		try {
			//����������
			Class.forName("com.mysql.cj.jdbc.Driver");
			long start=System.currentTimeMillis();
			//��������
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myblog?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", "root", "12zx13zc");
			long end=System.currentTimeMillis();
			System.out.println(con );
			System.out.println("�������Ӻ�ʱ��"+(end-start)+"����");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
