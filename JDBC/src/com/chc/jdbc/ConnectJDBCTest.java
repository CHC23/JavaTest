package com.chc.jdbc;
//jdbc���ݿ����Ӳ���

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
			System.out.println("���ݿ����ӳɹ����������Ӻ�ʱ��"+(end-start)+"����");
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.close(con);
		}
	}
}
