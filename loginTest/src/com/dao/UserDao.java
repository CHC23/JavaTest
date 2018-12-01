package com.dao;
//UserDa接口放大实现类 ，

import com.entity.User;
import java.util.List;

public interface UserDao{
	public boolean login(String name,String pwd);	//登陆接口
	public boolean register(User user);				//注册
	public List<User> getUserAll();					//返回用户信息集合
	public boolean delete(int id);					//根据用户删除用户
	public boolean update(int id,String name,String pwd,String sex,String home,String info);	//更新用户信息
	
}
