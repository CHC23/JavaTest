//�ļ����÷���1
//��Ҫ��d:\chcȷʵ����һ��hello.txt,\r\n�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ

import java.io.File;
import java.util.*;

public class FileTest1{
	public static void main(String[] args){
		File f=new File("d:/chc/hello.txt");
		System.out.println("��ǰ�ļ��ǣ�"+f);
		
		//�ж��ļ��Ƿ����
		System.out.println("�ļ��Ƿ���ڣ�"+f.exists());
		
		//�ж��Ƿ����ļ���
		System.out.println("�Ƿ����ļ��У�"+f.isDirectory());
		
		//�ж��Ƿ����ļ���
		System.out.println("�Ƿ����ļ���"+f.isFile());
		
		//��ȡ�ļ�����
		System.out.println("�ļ�����Ϊ��"+f.length());
		
		//��ȡ�ļ�����޸�ʱ��
		long time=f.lastModified();
		Date d=new Date(time);
		System.out.println("�ļ�����޸�ʱ��Ϊ��"+d);
		
		//�޸�����޸�ʱ��Ϊʱ��Ϊ2018.10.9 22��30��00
		Calendar c = Calendar.getInstance();
        c.set(2018, 10,9, 22, 30, 0);
		f.setLastModified(c.getTimeInMillis());
		
		//�ļ������� ��renameTo�������ڶ������ļ����ƽ����޸ģ����ǲ������޸�File�����name���ԡ�
		File f1=new File("d:/chc/helloworld.txt");
		f.renameTo(f1);
		System.out.println("hello.txt������Ϊhelloworld.txt");
	}
}