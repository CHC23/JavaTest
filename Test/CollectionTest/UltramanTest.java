//UltramanDataTest��main����

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class UltramanTest{
	public static void main(String[] args){
		UltramanDataTest u1=new UltramanDataTest(101,"���ư�����","�Ѻ�","1960-02");
		UltramanDataTest u2=new UltramanDataTest(102,"����������","�Ѻ�","1961-02");
		UltramanDataTest u3=new UltramanDataTest(103,"���İ�����","�Ѻ�","1962-02");
		UltramanDataTest u4=new UltramanDataTest(104,"�ܿ˰�����","�Ѻ�","1963-02");
		UltramanDataTest u5=new UltramanDataTest(105,"��˹������","�Ѻ�","1964-02");
		
		List<UltramanDataTest> list=new ArrayList<UltramanDataTest>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		list.add(u5);
		System.out.println(list.get(0).getBirthday());
		
	}
}