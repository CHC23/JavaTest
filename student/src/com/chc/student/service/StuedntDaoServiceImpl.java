package com.chc.student.service;
/*
 * 学生类的业务实现
 */
import java.sql.SQLException;
import java.util.List;

import com.chc.student.dao.StudentDao;
import com.chc.student.dao.StudentDaoImpl;
import com.chc.student.student.Page;
import com.chc.student.student.Student;

public class StuedntDaoServiceImpl implements StudentDaoService {
	
	public List<Student> selectAll() throws SQLException{
		StudentDao dao=new StudentDaoImpl();
		return dao.selectAll();
	}

	@Override
	public void insertStudent(Student student) throws SQLException {
		StudentDao dao=new StudentDaoImpl();
		dao.insertStudent(student);
	}

	@Override
	public Student checkLogin(String number, String password) {
		StudentDao dao=new StudentDaoImpl();
		return dao.selectLogin(number, password);
	}

	public Student editStudent(int id) throws SQLException {
		StudentDao dao=new StudentDaoImpl();
		return dao.editStudent(id);
	}

	@Override
	public void updateStudent(Student student) throws SQLException {
		StudentDao dao=new StudentDaoImpl();
		dao.updateStudent(student);
		
	}

	@Override
	public void deleteStudenet(int id) throws SQLException {
		StudentDao dao=new StudentDaoImpl();
		dao.deleteStudent(id);
	}

	@Override
	public Page selectStudentCurrentPage(int currentPage) throws SQLException {
		//封装某页的数据
		
		
		Page page=new Page();
		//获取当前页
		page.setCurrentPage(currentPage);
		
		//获取当前页学生信息记录数量
		page.setPageRecord(StudentDao.page_record);
		
		//获取当前页的学生信息数据
		StudentDao dao=new StudentDaoImpl();
		List<Student> list=dao.selectStudentCurrentPage(currentPage);
		page.setList(list);
		
		//获取数据库数据记录总数
		int count=dao.selectRecordCount();
		page.setTotalRecord(count);
		
		//获取页面总数
		page.setTotalPages(count%StudentDao.page_record==0?count/StudentDao.page_record:(count/StudentDao.page_record+1));
		
		return page;
		
	}
	
	
	
}
