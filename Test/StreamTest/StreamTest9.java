/**\
ʹ���ַ������ַ���д�뵽�ļ���FileWriter ��Writer�����࣬��FileWriter Ϊ�����ַ���д�뵽�ļ�
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;

public class StreamTest9{
public static void main(String[] args){
		File f=new File("d:/chc/test3.txt");
		//���������ļ���writer
		try(FileWriter fw=new FileWriter(f)){
			String data="��ĺ�ϲ����";
			char[] ch=data.toCharArray();
			fw.write(ch);
			for(char c:ch){
				System.out.print(c);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}