package com.chc.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.chc.student.student.Student;

/*
 * �������ݿ�
 */
public interface StudentDao {
	
	List<Student> selectAll()  throws SQLException ;
}
