package com.chc.studentdemo.servlets;

import com.chc.studentdemo.beans.Student;
import com.chc.studentdemo.dao.IStudentDao;
import com.chc.studentdemo.dao.StudentDaoImpl;
import com.chc.studentdemo.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private IStudentDao dao;
	
	public StudentServiceImpl() {
		dao=new StudentDaoImpl();
	}
	
	@Override
	public Student checkStudent(String number, String password) {
		return dao.selectStudentLogin(number,password);
	}

}
