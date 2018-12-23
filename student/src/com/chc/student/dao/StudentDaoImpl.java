package com.chc.student.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * StudentDao�ľ���ʵ��,��ѯ����ѧ����Ϣ
 */
import java.util.List;

import com.chc.student.student.Student;
import com.chc.student.utils.JdbcUtils;

public class StudentDaoImpl implements StudentDao {
	
	private  Connection conn;
	private  PreparedStatement ps;
	private  ResultSet rs;

	@Override
	public List<Student> selectAll() throws SQLException{
		//��ѯ����ѧ����Ϣʵ��
		Student student=null;

		List<Student> list=new ArrayList<Student>();
		conn=JdbcUtils.getMySqlConnection();
		String sql="select * from stu";
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setSname(rs.getString("sname"));
				student.setNumber(rs.getString("number"));
				student.setPassword(rs.getString("password"));
				student.setSex(rs.getString("sex"));
				student.setAge(rs.getInt("age"));
				student.setPhone(rs.getString("phone"));
				student.setSclass(rs.getString("sclass"));
				student.setInfo(rs.getString("info"));
				list.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
			
		}
		
		
		return list;
	
	}
	
	public void insertStudent(Student student) throws SQLException{
		
		//����ѧ����Ϣ�����ݿ�
		conn=JdbcUtils.getMySqlConnection();
		String sql="insert into stu(sname,number,password,sex,phone,age,sclass,info) values(?,?,?,?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,student.getSname());
			ps.setString(2, student.getNumber());
			ps.setString(3, student.getPassword());
			ps.setString(4,student.getSex());
			ps.setString(5,student.getPhone());
			ps.setInt(6,student.getAge());
			ps.setString(7,student.getSclass());
			ps.setString(8,student.getInfo());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
		}
		
			
	}

	@Override
	public Student selectLogin(String number, String password) {
		//�����û��������룬ʵ�ֵ�½
		Student student=null;
		conn=JdbcUtils.getMySqlConnection();
		String sql="select * from stu where number=? and password=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1, number);
			ps.setString(2, password);
			rs=ps.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setSname(rs.getString("sname"));
				student.setNumber(rs.getString("number"));
				student.setPassword(rs.getString("password"));
				student.setSex(rs.getString("sex"));
				student.setAge(rs.getInt("age"));
				student.setPhone(rs.getString("phone"));
				student.setSclass(rs.getString("sclass"));
				student.setInfo(rs.getString("info"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
			
		}
		return student;
	}

	@Override
	public Student editStudent(int id) throws SQLException {
		Student student=null;
		conn=JdbcUtils.getMySqlConnection();
		String sql="select * from stu where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setSname(rs.getString("sname"));
				student.setNumber(rs.getString("number"));
				student.setPassword(rs.getString("password"));
				student.setSex(rs.getString("sex"));
				student.setAge(rs.getInt("age"));
				student.setPhone(rs.getString("phone"));
				student.setSclass(rs.getString("sclass"));
				student.setInfo(rs.getString("info"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
			
		}
		return student;
	}
	
	
	@Override
	public void updateStudent(Student student) throws SQLException {
		//����ѧ����Ϣ�����ݿ��daoʵ��
		conn=JdbcUtils.getMySqlConnection();
		String sql="update stu set sname=?,number=?,sex=?,phone=?,age=?,sclass=?,info=? where id=?";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,student.getSname());
			ps.setString(2, student.getNumber());
			ps.setString(3,student.getSex());
			ps.setString(4,student.getPhone());
			ps.setInt(5,student.getAge());
			ps.setString(6,student.getSclass());
			ps.setString(7,student.getInfo());
			ps.setInt(8, student.getId());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
		}
	}

	@Override
	public void deleteStudent(int id) throws SQLException {
		// ɾ��ѧ����Ϣ
		
		conn=JdbcUtils.getMySqlConnection();
		String sql="delete from stu where id=?";
		
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
	
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
		}
		
	}

	@Override
	public List<Student> selectStudentCurrentPage(int currentPage) throws SQLException {
		// ʵ�ֲ�ѯ��ǰҳ��ѧ����Ϣ
		Student student=null;
		List<Student> list=new ArrayList<Student>();
		conn=JdbcUtils.getMySqlConnection();
		String sql="select * from stu limit ? offset ?";		//ռλ��1��һҳ������Ϣ������ռλ��2������ѧ����¼����
	
		try {
			ps=conn.prepareStatement(sql);
			ps.setInt(1, page_record);
			ps.setInt(2, (page_record-1)*page_record);
			rs=ps.executeQuery();
			while(rs.next()) {
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setSname(rs.getString("sname"));
				student.setNumber(rs.getString("number"));
				student.setPassword(rs.getString("password"));
				student.setSex(rs.getString("sex"));
				student.setAge(rs.getInt("age"));
				student.setPhone(rs.getString("phone"));
				student.setSclass(rs.getString("sclass"));
				student.setInfo(rs.getString("info"));
				list.add(student);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
		}
		
		return list;
	}

	@Override
	public int selectRecordCount() throws SQLException {
		// ʵ�ֲ�ѯ���ݿ���ѧ����������
		Long count=null;
		conn=JdbcUtils.getMySqlConnection();
		String sql="select * from stu";
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				count++;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
		}
		return count.intValue();
		
	}
		
	

}
