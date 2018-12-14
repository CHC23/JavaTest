package com.chc.studentdemo.beans;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;			//ҵ���޹�����
	private String password;	//��¼����
	private String number;		//ѧ��
	private String name;		//����
	private int age;			//����
	private double score;		//�ɼ�
	private String sex;
	
	public Student() {
		//�޲ι�����
		super();
	}
	public Student(String number,String name,int age,double score,String sex ) {
		//���ι�����
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
