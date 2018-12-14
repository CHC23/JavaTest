package com.chc.studentdemo.service;

import com.chc.studentdemo.beans.Student;
import com.chc.studentdemo.dao.IStudentDao;
import com.chc.studentdemo.dao.StudentDaoImpl;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;
	
	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}
	
	@Override
	public Student checkStudent(String number, String password) {
		return dao.selectStudentLogin(number,password);
	}

	@Override
	public void saveStudent(Student student) {
		dao.insertStudent(student);
	}

}
