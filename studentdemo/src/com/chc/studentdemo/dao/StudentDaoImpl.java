package com.chc.studentdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.chc.studentdemo.beans.Student;
import com.chc.studentdemo.utils.JdbcUtils;

public class StudentDaoImpl implements IStudentDao {
	
	private Connection conn;
//	private Statement stmt;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public Student selectStudentLogin(String number, String password) {
		Student student=null;
		try {
			conn=JdbcUtils.getMySqlConnection();
			String sql="select * from student where number=? and password=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, number);
			ps.setString(2, password);
			rs=ps.executeQuery();
			if(rs.next()) {
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setNumber(rs.getString("number"));
				student.setPassword(rs.getString("password"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				student.setScore(rs.getDouble("score"));
				student.setSex(rs.getString("sex"));
				
				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcUtils.close(conn, ps, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;
	}


	@Override
	public void insertStudent(Student student) {
		try {
			conn=JdbcUtils.getMySqlConnection();
			String sql="insert into student(number,password,name,age,score,sex) values(?,?,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, student.getNumber());
			ps.setString(2, student.getPassword());
			ps.setString(3, student.getName());
			ps.setInt(4, student.getAge());
			ps.setDouble(5, student.getScore());
			ps.setString(6, student.getSex());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				JdbcUtils.close(conn, ps, rs);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
