/**
ʹ���ַ�����ȡ�ļ���FileReader ��Reader���࣬��FileReader Ϊ�������ļ���ȡ
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest8{
	public static void main(String[] args){
		File f=new File("d:/chc/test3.txt");
		
		//���������ļ���reader
		try(FileReader fd=new FileReader(f)){
			char[] all=new char[(int)f.length()];
			fd.read(all);
			for(char b:all){
				System.out.print(b);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}