//��mapʵ�ִ洢������������

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;	

public class MapTest{
	public static void main(String[] args){
		Map  map1=new HashMap();
		map1.put("id",101);
		map1.put("name","���ư�����");
		map1.put("camp","�Ѻ�");
		map1.put("birthday","1960-02");
		
		Map  map2=new HashMap();
		map2.put("id",102);
		map2.put("name","����������");
		map2.put("camp","�Ѻ�");
		map2.put("birthday","1961-02");
		
		Map  map3=new HashMap();
		map3.put("id",103);
		map3.put("name","���İ�����");
		map3.put("camp","�Ѻ�");
		map3.put("birthday","1962-02");
		
		Map  map4=new HashMap();
		map4.put("id",104);
		map4.put("name","�ܿ˰�����");
		map4.put("camp","�Ѻ�");
		map4.put("birthday","1963-02");
		
		Map  map5=new HashMap();
		map5.put("id",101);
		map5.put("name","��˹������");
		map5.put("camp","�Ѻ�");
		map5.put("birthday","1964-02");
		
		
		List <Map> list=new ArrayList<Map>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
		printData(list);
	}
	
	public static void printData(List<Map> list){
		for(int i=0;i<list.size();i++){
			Map temMap=list.get(i);
			System.out.println(temMap.get("id")+"  "+temMap.get("name")+"  "+temMap.get("camp")+"  "+temMap.get("birthday"));
		}
	} 
	
}