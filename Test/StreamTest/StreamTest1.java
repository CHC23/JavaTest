//���������ļ�������

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class StreamTest1{
	public static void main(String[] args){
		try{
			//�ļ�chc.txt������ΪAB��ASCII��Ϊ65��66
			File f=new File("d:/chc.txt");
			
			//���������ļ���������
			FileInputStream fs=new FileInputStream(f);
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}