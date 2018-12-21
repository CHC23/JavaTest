package com.chc.student.service;
/*
 * 学生类的业务处理
 */
import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Student;

public interface StudentDaoService {
	
	//查询所有学生信息
	List<Student> selectAll() throws SQLException;
	
	//插入学生
	void insertStudent(Student student) throws SQLException;
	
	//验证登录
	Student checkLogin(String number, String password);

	//取出学生信息到编辑页面
	Student editStudent(int id) throws SQLException;

	//更新学生信息到数据库的service
	void updateStudent(Student student) throws SQLException;

	//按id删除学生的service
	void deleteStudenet(int id) throws SQLException;
	
}
