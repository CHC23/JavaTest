/**
java����֮���ͺ����Ͱ�ȫ������
*/

import java.util.*;

 class Apple{
	private static long counter;
	private final long id=counter++;
	public long id(){
		return id;
	}
}

class Orange{}


public class ApplesAndOrangesWithGenerics{
	@SuppressWarnings("���ܼ����쳣")
	public  static void  main(String[] args){
		ArrayList<Apple> apples=new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			apples.add(new Apple());		
		//û����ֹ��Apple�м���Orange
		}
		//apples.add(new Orange());
		for(int i=0;i<=apples.size();i++){
			System.out.println(apples.get(i).id());
			//orangeֻ�����е�ʱ���⵽
		}
		for(Apple c:apples){
			System.out.println(c.id());
		}
		
	}
}