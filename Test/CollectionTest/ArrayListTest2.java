//ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class ArrayListTest2{
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		List list=new ArrayList();
		
		list.add("������¥�ذ���");
		list.add(new Date());
		list.add(1024);				//��װ����Զ�װ��
		list.add(new Test());
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		//list.remove("������¥�ذ���");
		System.out.println(list.size());
		
		List list2=new ArrayList();
		list2.add("hello world");
		list2.add("hello ��С��");
		
		list.add(list2);
		System.out.println(list.size());
		
		String str=(String) list.get(0);				//��˳�����ArrayList()
		System.out.println(str);
		
		list.set(2,"lucky");		//���뼯��
		
		list.remove(4);		//�������Ƴ�
		
		System.out.println(list);
		
	}
}

class Test{
	
}