package com.chc.studentdemo.service;

import com.chc.studentdemo.beans.Student;

public interface IStudentService {

	//�û���֤
	Student checkStudent(String number, String password);
	
	//����д�����ݿ�
	Integer saveStudent(Student student);

	

}
