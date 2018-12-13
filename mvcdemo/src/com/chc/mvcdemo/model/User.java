package com.chc.mvcdemo.model;
/**
 * 用户的类
 * @author chc
 *
 */
public class User {
	private int id;
	private String username;
	private String password;
	private String sex;
	private String home;
	private String info;
	
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
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
		this.sex=sex;
	}
	
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home=home;
	}
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info=info;
	}
	
	public User() {
		super();
	}
	
	public User(int id,String username,String password,String sex,String home,String info) {
		this.id=id;
		this.username=username;
		this.password=password;
		this.sex=sex;
		this.home=home;
		this.info=info;
	}
	@Override
	//重写toString()  方便测试
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", home="
				+ home + ", info=" + info + "]";
	}
	
	
}
