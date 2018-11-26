package com.chc.jdbc;

/**
*PreparedStatement()�������ڷ��ʹ�������sql���
*��Statement()���Ч�ʸ�   ���ɷ�ֹsqlע��
*��ط�����execute():������䣬�����Ƿ��н������
*		execute():����select��䣬����ResultSet�����
*		executeUpdate():����insert��update��delete���������ظ��µ�����
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
			
			String sql="insert into nbaplayer (name,age,position) values (?,?,?)";		//?��ռλ��
			ps=con.prepareStatement(sql);
			
			//����������1��ʼ��
			ps.setString(1,"����");
			ps.setString(2, "34");
			ps.setString(3, "����");
			
			
			//ֱ��ʹ��Object�������ľ�������
			ps.setObject(1,"�����");
			ps.setObject(2,"46");
			ps.setObject(3,"�з�");
		
			ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTools.close(con, ps);
		}
	}
}
