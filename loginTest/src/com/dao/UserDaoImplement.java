package com.dao;
//ʵ��UserDao�ӿ��Լ����еķ���
import com.entity.User;
import com.util.DBConn;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImplement implements UserDao{
	
	
	
	public boolean login(String name,String pwd) {
		//�û���¼
		boolean flag=false;
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
		//�û�ע��
		@SuppressWarnings("unused")
		boolean flag=false;
		DBConn.init();
		int i=DBConn.addUpdDel("insert into user(name,pwd,sex,home,info) values ('"+user.getName()+"','"+user.getPwd()
										+"','"+user.getSex()+"','"+user.getHome()+"','"+user.getInfo()+"')"  );
		if(i>0) {
			flag=true;
		}
		DBConn.sqlClose();
		return flag=false;
	}
	
	
	public List<User> getUserAll() {
		//ȡ���û���Ϣ
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
	
	public boolean delete(int id) {
		//����IDɾ���û�
		boolean flag=false;
		DBConn.init();
		String sql="delete from user where id=";
		int i=DBConn.addUpdDel(sql);
		if(i>0) {
			flag=true;
		}
		DBConn.sqlClose();
		return flag;
	}
	
	public boolean update(int id,String name,String pwd,String sex,String home,String info) {
		//�����û���Ϣ
		boolean flag=false;
		DBConn.init();
		String sql="update user set name='"+name
				+"',pwd='"+pwd
				+"',sex='"+pwd
				+"',home='"+home
				+"',info='"+info+"' where id="+id;
		int i=DBConn.addUpdDel(sql);
		if(i>0) {
			flag=true;
		}
		return flag;
	}
}
