package com.chc.student.student;

/*
 * 封装学生对象的bean
 */


public class Student {
	private int id;
	private String sname;
	private String sex;
	private String phone;
	private Integer age;
	private String hobby;
	private String info;
	
	
	
	public Student() {
		//无参构造器
		super();
	}
	
	public Student(String sname, String sex, String phone, Integer age, String hobby, String info) {
		//有参构造器
		super();
		this.sname = sname;
		this.sex = sex;
		this.phone = phone;
		this.age = age;
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
	public	int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
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
