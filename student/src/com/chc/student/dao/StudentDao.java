package com.chc.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Student;

/*
 * �������ݿ�
 */
public interface StudentDao {
	
	int page_record=10;			//һҳ��ʾѧ����Ϣ����
	
	
	//��ѯ��ǰҳ��ѧ����Ϣ
	List<Student> selectStudentCurrentPage(int currentPage) throws SQLException;
	
	//��ѯѧ����Ϣ
	List<Student> selectAll() throws SQLException;
	
	//����ѧ��
	void insertStudent(Student student) throws SQLException;
	
	//��¼ƥ��
	Student selectLogin(String number, String password);
	
	//ȡ��ѧ����Ϣ���༭ҳ
	Student editStudent(int id) throws SQLException;
	
	//����ѧ����Ϣ�����ݿ�
	void updateStudent(Student student) throws SQLException;
	
	//ɾ��ѧ����Ϣ
	void deleteStudent(int id) throws SQLException;
	
	//��ѯ���ݿ���������
	int selectRecordCount() throws SQLException;
}
