package com.chc.studentdemo.service;

import com.chc.studentdemo.beans.Student;

public interface IStudentService {

	//用户验证
	Student checkStudent(String number, String password);

}
