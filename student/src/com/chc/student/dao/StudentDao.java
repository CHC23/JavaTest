package com.chc.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Student;

/*
 * �������ݿ�
 */
public interface StudentDao {
	
	//��ѯѧ����Ϣ
//	List<Student> selectAll(String number, String password) throws SQLException;
	List<Student> selectAll() throws SQLException;
	
	//����ѧ��
	void insertStudent(Student student) throws SQLException;
	
	//��¼ƥ��
	Student selectLogin(String number, String password);
	
	
}
