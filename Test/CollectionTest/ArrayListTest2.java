//ArrayList

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class ArrayListTest2{
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		List list=new ArrayList();
		
		list.add("万座高楼藏阿娇");
		list.add(new Date());
		list.add(1024);				//包装类的自动装箱
		list.add(new Test());
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		//list.remove("万座高楼藏阿娇");
		System.out.println(list.size());
		
		List list2=new ArrayList();
		list2.add("hello world");
		list2.add("hello 李小姐");
		
		list.add(list2);
		System.out.println(list.size());
		
		String str=(String) list.get(0);				//按顺序操作ArrayList()
		System.out.println(str);
		
		list.set(2,"lucky");		//存入集合
		
		list.remove(4);		//按索引移除
		
		System.out.println(list);
		
	}
}

class Test{
	
}