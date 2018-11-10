/**
集合之遍历ArrayList
*/

import java.util.*;

public class ArrayListTest1{
	public static void main(String[] args){
		List<String> list=new ArrayList<String>();
		list.add("满腔的热血已经沸腾");
		list.add("要为真理而斗争");
		list.add("旧世界打个落花流水");
		list.add("奴隶们起来，起来！！！");
		
		//使用foreach遍历
		for(String s:list){
			System.out.println(s);
		}
		
		
		//把链表转换为数组相关的内容再遍历
		String[] stringArray=new String[list.size()];
		list.toArray(stringArray);
		for(int i=0;i<stringArray.length;i++){
			System.out.println(stringArray[i]);
		}
		
		
		//使用迭代器进行遍历
		Iterator<String> ite=list.iterator();
		while(ite.hasNext())//判断下一个元素后是否有值
		{
			System.out.println(ite.next());
		}
	}
}