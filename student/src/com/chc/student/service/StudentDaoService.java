package com.chc.student.service;
/*
 * ѧ�����ҵ����
 */
import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Page;
import com.chc.student.student.Student;

public interface StudentDaoService {
	
	//��ѯ��ǰҳ��ѧ����Ϣ
	Page selectStudentCurrentPage(int currentPage) throws SQLException;
	
	//��ѯ����ѧ����Ϣ
	List<Student> selectAll() throws SQLException;
	
	//����ѧ��
	void insertStudent(Student student) throws SQLException;
	
	//��֤��¼
	Student checkLogin(String number, String password);

	//ȡ��ѧ����Ϣ���༭ҳ��
	Student editStudent(int id) throws SQLException;

	//����ѧ����Ϣ�����ݿ��service
	void updateStudent(Student student) throws SQLException;

	//��idɾ��ѧ����service
	void deleteStudenet(int id) throws SQLException;
	
}
