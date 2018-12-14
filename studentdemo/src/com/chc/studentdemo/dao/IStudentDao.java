package com.chc.studentdemo.dao;

import com.chc.studentdemo.beans.Student;

public interface IStudentDao {

	Student selectStudentLogin(String number, String password);

}
