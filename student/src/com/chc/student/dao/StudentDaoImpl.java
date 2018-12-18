package com.chc.student.dao;
import java.sql.Connection;
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
	public List<Student> selectAll() throws SQLException {
		Student student=null;

		List<Student> list=new ArrayList<Student>();
		conn=JdbcUtils.getMySqlConnection();
		String sql="select * from stu";
		ps=conn.prepareStatement(sql);
		rs=ps.executeQuery();
		if(rs.next()) {
			student=new Student();
			student.setId(rs.getInt("id"));
			student.setSname(rs.getString("sname"));
			student.setSex(rs.getString("sex"));
			student.setBirthday(rs.getDate("birthday"));
			student.setPhone(rs.getString("phone"));
			student.setHobby(rs.getString("hobby"));
			student.setInfo(rs.getString("info"));
			list.add(student);
		}
		
		
		return list;
	}

}
