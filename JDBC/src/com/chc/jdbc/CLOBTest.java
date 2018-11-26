package com.chc.jdbc;


/**
 * CLob���ı�����������ݿ����
 * 
 * 
 * */
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CLOBTest {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=JDBCTools.getMySqlConnection();
			
//			ps=con.prepareStatement("insert into nbaplayer (name,age,info) values (?,?,?)");
//			ps.setObject(1,"�Ʊ�");
//			ps.setObject(2,"40");
//			ps.setClob(3, new FileReader(new File("kobe.txt")));		//ֱ�Ӵ����ı��ļ���
			
//			ps.executeUpdate();
			
			
			
			//���ݿ���ȡ�����ı�����
			ps=con.prepareStatement("select * from nbaplayer where id=?");
			ps.setObject(1,"1018");
			rs=ps.executeQuery();
			while(rs.next()) {
				Clob c=rs.getClob("info");
				Reader r=c.getCharacterStream();
				int temp=0;
				while((temp=r.read())!=-1) {
					System.out.print((char)temp);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}finally {									//�ر����ݿ����ӣ���ѭ�ȿ����ԭ��
			JDBCTools.close(con,ps,rs);
		}
	}

	
}