package com.chc.jdbc;

//测试ResultSet()方法

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
			ps.setObject(1, 3);						//取出ID>3的记录
			
			rs=ps.executeQuery();					//返回一个结果集
			while(rs.next()) {						 //next():判断记录下一条是否为空的游标
				System.out.println(rs.getInt(1)+"+++"+rs.getString(2)+"+++"+rs.getInt(3)+"+++"+rs.getString(4));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {									//关闭数据库连接，遵循先开后闭原则。
			JDBCTools.close(con, ps, rs);
		}
	}

	
}