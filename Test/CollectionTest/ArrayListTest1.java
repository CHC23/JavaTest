/**
����֮����ArrayList
*/

import java.util.*;

public class ArrayListTest1{
	public static void main(String[] args){
		List<String> list=new ArrayList<String>();
		list.add("��ǻ����Ѫ�Ѿ�����");
		list.add("ҪΪ���������");
		list.add("���������仨��ˮ");
		list.add("ū��������������������");
		
		//ʹ��foreach����
		for(String s:list){
			System.out.println(s);
		}
		
		
		//������ת��Ϊ������ص������ٱ���
		String[] stringArray=new String[list.size()];
		list.toArray(stringArray);
		for(int i=0;i<stringArray.length;i++){
			System.out.println(stringArray[i]);
		}
		
		
		//ʹ�õ��������б���
		Iterator<String> ite=list.iterator();
		while(ite.hasNext())//�ж���һ��Ԫ�غ��Ƿ���ֵ
		{
			System.out.println(ite.next());
		}
	}
}