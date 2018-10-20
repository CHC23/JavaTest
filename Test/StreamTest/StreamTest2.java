/*
InputStream���ֽ���������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
FileInputStream ��InputStream���࣬��FileInputStream Ϊ�������ļ���ȡ
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamTest2{
	public static void main(String[] args){
		try{
			//�ļ�chc.txt������ΪAB����Ӧascll��Ϊ65��66
			File f=new File("d:/chc.txt");
			//���������ļ���������
			FileInputStream fs=new FileInputStream(f);
			//�����ֽ����顣����Ϊ�ļ��ĳ���
			byte[] all=new byte[(int)f.length()];
			//���ֽ�������ʽ��ȡ�ļ�����
			fs.read(all);
			for(byte b:all){
				System.out.println(b);
			}
			
			fs.close();		//ʹ��������Ӧ�ùر���
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}