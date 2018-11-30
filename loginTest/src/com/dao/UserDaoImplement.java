package com.dao;
//实现UserDao接口以及其中的方法
import com.entity.User;
import com.util.DBConn;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplement implements UserDao{
	
	
	
	public boolean login(String name,String pwd) {
		boolean flag;
		try {
			DBConn.init();
			ResultSet rs=DBConn.sqlSelest("select * from user where name='+name+' and pwd='+pwd+'");
			while(rs.next()) {
				if(rs.getString("name").equals(name)&&rs.getString("pwd").equals(pwd)) {
					flag=true;
				}
			}
			DBConn.sqlClose();
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
		
	}
	
	public boolean register(User user) {
		boolean flag;
		DBConn.init();
		int i=DBConn.addUpdDel("insert into user(name,pwd,sex,home,info) values ('"+user.getName()+"','"+user.getPwd()
										+"','"+user.getSex()+"','"+user.getHome()+"','"+user.getInfo()+"')"  );
		if(i>0) {
			flag=true;
		}
		DBConn.sqlClose();
		return flag;
	}
	
	
	public List<User> getUserAll() {
		List<User> list=new ArrayList<User>();
		try {
			DBConn.init();
			ResultSet rs=DBConn.sqlSelest("select * from user");
			while(rs.next()) {
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setSex(rs.getString("sex"));
				user.setHome(rs.getString("home"));
				user.setInfo(rs.getString("info"));
				list.add(user);
			}
			DBConn.sqlClose();
			return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
