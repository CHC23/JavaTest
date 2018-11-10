/**
java容器之泛型和类型安全的容器
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
	@SuppressWarnings("不受检查的异常")
	public  static void  main(String[] args){
		ArrayList<Apple> apples=new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			apples.add(new Apple());		
		//没有阻止在Apple中加入Orange
		}
		//apples.add(new Orange());
		for(int i=0;i<=apples.size();i++){
			System.out.println(apples.get(i).id());
			//orange只在运行的时候检测到
		}
		for(Apple c:apples){
			System.out.println(c.id());
		}
		
	}
}