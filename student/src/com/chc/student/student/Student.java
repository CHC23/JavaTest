package com.chc.student.student;

/*
 * 封装学生对象的bean
 */


public class Student {
	private int id;
	private String sname;
	private String number;
	private String password;
	private String sex;
	private String phone;
	private Integer age;
	private String sclass;
	private String info;
	
	
	
	public Student() {
		//无参构造器
		super();
	}
	
	public Student(String sname, String number,String password,String sex, String phone, Integer age, String sclass, String info) {
		//有参构造器
		super();
		this.sname = sname;
		this.number=number;
		this.password=password;
		this.sex = sex;
		this.phone = phone;
		this.age = age;
		this.sclass = sclass;
		this.info = info;
	}
	
	public Student(String sname, String number,String sex, String phone, Integer age, String sclass, String info) {
		//有参构造器
		//更新学生信息，不需要更新密码
		super();
		this.sname = sname;
		this.number=number;
		this.sex = sex;
		this.phone = phone;
		this.age = age;
		this.sclass = sclass;
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
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number=number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
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
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
