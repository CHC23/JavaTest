package com.dao;
//UserDa�ӿڷŴ�ʵ���� ��

import com.entity.User;
import java.util.List;

public interface UserDao{
	public boolean login(String name,String pwd);	//��½�ӿ�
	public boolean register(User user);				//ע��
	public List<User> getUserAll();					//�����û���Ϣ����
	public boolean delete(int id);					//�����û�ɾ���û�
	public boolean update(int id,String name,String pwd,String sex,String home,String info);	//�����û���Ϣ
	
}
