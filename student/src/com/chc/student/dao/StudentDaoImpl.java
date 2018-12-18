package com.chc.student.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * StudentDao的具体实现,查询所有学生信息
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
				student.setSex(rs.getString("sex"));
				student.setAge(rs.getInt("age"));
				student.setPhone(rs.getString("phone"));
				student.setHobby(rs.getString("hobby"));
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
		conn=JdbcUtils.getMySqlConnection();
		String sql="insert into stu(sname,sex,phone,age,hobby,info) values(?,?,?,?,?,?)";
		try {
			ps=conn.prepareStatement(sql);
			ps.setString(1,student.getSname());
			ps.setString(2,student.getSex());
			ps.setString(3,student.getPhone());
			ps.setInt(4,student.getAge());
			ps.setString(5,student.getHobby());
			ps.setString(6,student.getInfo());
		
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(conn, ps, rs);
		}
		
			
	}
		
	

}
