/**OutputStream���ֽ��������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
FileOutputStream ��OutputStream���࣬��FileOutputStream Ϊ�����ļ�д������
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest3{
	public static 	void main(String[] args){
		try{
			File f=new File("d:/chc/test1.txt");     //�������ļ���
			//���������Ƕ����ֽ����飬��88,89��ʼ������Ӧ���ַ���X,Y.
			byte data[]={88,89};
			//���������ļ��������
			FileOutputStream fo=new FileOutputStream(f);
			//������д�������
			fo.write(data);
			//�ر���
			fo.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}