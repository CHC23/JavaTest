//file���÷���2

import java.io.File;
import java.io.IOException;

public class FileTest2{
	public static void main(String[] args) throws IOException{
		File f=new File("d:/chc/test/hello.txt");
		//���ַ����������ʽ���ص�ǰĿ¼�µ������ļ������������ļ������ļ��У�
		f.list();
		//���ļ��������ʽ���ص�ǰĿ¼�µ������ļ������������ļ������ļ��У�
		File[] fs=f.listFiles();
		
		//���ַ�����ʽ���ػ�ȡ�����ļ���
		f.getParent();
		
		//���ļ���ʽ���ػ�ȡ�����ļ���
		f.getParentFile();
		
		//�����ļ��У�������ļ���test�����ڣ��򴴽���Ч
		f.mkdir();
		
		//�����ļ��У�������ļ���test�����ڣ��򴴽�test���ļ��С�
		f.mkdirs();
		
		//����һ�����ļ��У�������ļ���test�����ڣ����׳��쳣
		f.createNewFile();
		
		//����һ�����ļ���֮ǰ��ͨ�����ᴴ�����ļ���
		f.getParentFile().mkdirs();
		
		//�г����е��̷�
		f.listRoots();
		
		//ɾ���ļ�
		f.delete();
		
		//jvm����ʱɾ���ļ���ͨ��������ʱ�ļ�
		f.deleteOnExit();
	}
}