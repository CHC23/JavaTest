package com.chc.jdbc;

//����ResultSet()����

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
			con=JDBCTools.getMySqlConnection();
			
			String sql="select * from nbaplayer where id>?";
			ps=con.prepareStatement(sql);
			ps.setObject(1, 3);						//ȡ��ID>3�ļ�¼
			
			rs=ps.executeQuery();					//����һ�������
			while(rs.next()) {						 //next():�жϼ�¼��һ���Ƿ�Ϊ�յ��α�
				System.out.println(rs.getInt(1)+"+++"+rs.getString(2)+"+++"+rs.getInt(3)+"+++"+rs.getString(4));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {									//�ر����ݿ����ӣ���ѭ�ȿ����ԭ��
			JDBCTools.close(con, ps, rs);
		}
	}

	
}