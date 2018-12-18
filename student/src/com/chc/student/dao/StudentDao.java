package com.chc.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Student;

/*
 * 访问数据库
 */
public interface StudentDao {
	
	//查询学生信息
	List<Student> selectAll() throws SQLException;
	
	//插入学生
	void insertStudent(Student student) throws SQLException;
}
