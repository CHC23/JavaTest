package com.chc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetTest {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//����������
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//��������
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", "root", "12zx13zc");
			
			String sql="select * from nbaplayer where id>?";
			ps=con.prepareStatement(sql);
			ps.setObject(1, 3);				//ȡ��ID>3�ļ�¼
			
			rs=ps.executeQuery();			//����һ�������
			while(rs.next()) {				//next():�жϼ�¼��һ���Ƿ�Ϊ�յ��α�
				System.out.println(rs.getInt(1)+"+++"+rs.getString(2)+"+++"+rs.getInt(3)+"+++"+rs.getString(4));
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
					// TODO Auto-generated catch block
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