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
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", "root", "12zx13zc");
			
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
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
	
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}
	}
}
