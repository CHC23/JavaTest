//���������ļ�������

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class StreamTest1{
	public static void main(String[] args){
		try{
			//�ļ�chc.txt������ΪAB��ASCII��Ϊ65��66
			File f=new File("d:/chc.txt");
			
			//���������ļ����������������
			//FileInputStream fs=new FileInputStream(f);		//ͨ��������������԰����ݴ�Ӳ���ж�ȡ��java������м��ڴ��С�
			
			FileOutputStream fs=new FileOutputStream(f); //ͨ�������������԰����ݴ��ڴ��������Ӳ�̵��ļ��С�
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}