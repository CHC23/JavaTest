package com.chc.studentdemo.service;

import com.chc.studentdemo.beans.Student;

public interface IStudentService {

	//�û���֤
	Student checkStudent(String number, String password);
	
	//����д�����ݿ�
	void saveStudent(Student student);

	

}
