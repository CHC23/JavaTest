//PrintWriter()�����ַ������    ����һ��д��һ������

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamTest11{
	public static void main(String[] args){
		File f=new File("D:/chc/test1.txt");
		
		try(
			FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw);	//�����ļ��ַ���    ���������뽨����һ�����ڵ�����
			){
			pw.println("���������һ��ɡ");
			pw.println("��ס��������Ĺµ�");
			pw.println("��ȴ���յ����ס���������");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}