package com.chc.studentdemo.service;

import com.chc.studentdemo.beans.Student;

public interface IStudentService {

	//用户验证
	Student checkStudent(String number, String password);
	
	//数据写入数据库
	Integer saveStudent(Student student);

	

}
