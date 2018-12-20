package com.chc.student.service;
/*
 * 学生类的业务实现
 */
import java.sql.SQLException;
import java.util.List;

import com.chc.student.dao.StudentDao;
import com.chc.student.dao.StudentDaoImpl;
import com.chc.student.student.Student;

public class StuedntDaoServiceImpl implements StudentDaoService {
	
	public List<Student> selectAll() throws SQLException{
		StudentDao dao=new StudentDaoImpl();
		return dao.selectAll();
	}

	@Override
	public void insertStudent(Student student) throws SQLException {
		StudentDao dao=new StudentDaoImpl();
		dao.insertStudent(student);
	}

	@Override
	public Student checkLogin(String number, String password) {
		StudentDao dao=new StudentDaoImpl();
		return dao.selectLogin(number, password);
	}

	public Student editStudent(int id) throws SQLException {
		StudentDao dao=new StudentDaoImpl();
		return dao.editStudent(id);
	}

	@Override
	public void updateStudent(Student student) throws SQLException {
		StudentDao dao=new StudentDaoImpl();
		dao.updateStudent(student);
		
	}
	
	
	
}
