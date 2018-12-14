package com.chc.studentdemo.beans;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;			//业务无关主键
	private String password;	//登录密码
	private String number;		//学号
	private String name;		//姓名
	private int age;			//年龄
	private double score;		//成绩
	private String sex;
	
	public Student() {
		//无参构造器
		super();
	}
	public Student(String number,String name,int age,double score,String sex ) {
		//带参构造器
		super();
		this.number=number;
		this.name=name;
		this.age=age;
		this.score=score;
		this.sex=sex;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", password=" + password + ", number=" + number + ", name=" + name + ", age=" + age
				+ ", score=" + score + ", sex=" + sex + "]";
	}
	
	
}
