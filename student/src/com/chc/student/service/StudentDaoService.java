package com.chc.student.service;
/*
 * ѧ�����ҵ����
 */
import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Student;

public interface StudentDaoService {
	List<Student> selectAll() throws SQLException;
	
	//����ѧ��
	void insertStudent(Student student) throws SQLException;
}
