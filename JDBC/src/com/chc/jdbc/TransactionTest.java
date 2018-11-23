package com.chc.jdbc;

/**
 * ��������Ļ�������
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class TransactionTest {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps1=null;
		PreparedStatement ps2=null;
		ResultSet rs=null;
		try {
			//����������
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			//��������
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT", 
					"root", "12zx13zc");
			con.setAutoCommit(false);			//Ĭ����true���Զ��ύ���������Ϊ�ֶ��ύ
			
			ps1=con.prepareStatement("insert into nbaplayer (name,age,position) values (?,?,?)");
			ps1.setObject(1, "����");		
			ps1.setObject(2, "29");	
			ps1.setObject(3, "Сǰ��");
			ps1.execute();
			System.out.println("����һ�����ɹ�");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ps2=con.prepareStatement("insert into nbaplayer (name,age,position) values (?,?,?)");
			ps2.setObject(1, "�׽���");		
			ps2.setObject(2, "31");
			//ps2.setObject(3, "��ǰ��");
			ps2.execute();						//����ᱨ���������ύʧ�ܣ������ع�������һ�ύǰ�����������ﶼδ�ύ�ɹ�
			System.out.println("����������ɹ�");
			
			con.commit();			//�ֶ��ύ����
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}					//������ύʧ�ܣ��������ع������е�����δ�ύ��״̬
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
			if(ps1!=null) {
				try {
					ps1.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps2!=null) {
				try {
					ps2.close();
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
