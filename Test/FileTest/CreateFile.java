//ʹ�þ���·�������·������file����

import java.io.File;

public class CreateFile{
	public static void main(String[] args){
		//����·��
		File f1=new File("d:/chc");
		System.out.println("f1�ľ���·����"+f1.getAbsolutePath());	
		//���·��
		File f2=new File("/hello.txt");
		System.out.println("f2�ľ���·����"+f2.getAbsolutePath());
		//f1��Ϊ��Ŀ¼�����ļ�����
		File f3=new File(f1,"hello.txt");
		System.out.println("f3�ľ���·����"+f3.getAbsolutePath());
	}
}