package com.chc.student.student;

/*
 * 封装学生对象的bean
 */
import java.util.Date;

public class Student {
	private int id;
	private String sname;
	private String sex;
	private String phone;
	private Date birthday;
	private String hobby;
	private String info;
	
	
	
	public Student() {
		//无参构造器
		super();
	}
	
	public Student(int id, String sname, String sex, String phone, Date birthday, String hobby, String info) {
		//有参构造器
		super();
		this.id = id;
		this.sname = sname;
		this.sex = sex;
		this.phone = phone;
		this.birthday = birthday;
		this.hobby = hobby;
		this.info = info;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
