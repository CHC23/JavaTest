/**
FileOutputStream()
������������һ���ļ������ļ���д���ݡ�
��������ڴ��ļ��������ǰ��Ŀ���ļ������ڣ���ô�����ᴴ�����ļ���
*/

import java.io.*;
//����.txt�ļ� ���Ѹ����������Զ�����Ӱ��д�����ļ��������������̨
public class FileStreamTest{
	public static void  main(String[] args){	
		try{
			byte bWrite []={5,2,0};
			OutputStream os=new FileOutputStream("test.txt");
			for(int i=0;i<bWrite.length;i++){
				os.write(bWrite[i]);//д���ֽ�
			}
			os.close();
			InputStream is=new FileInputStream("test.txt");
			int size=is.available();
			for(int i=0;i<size;i++){
				System.out.print((char)is.read()+" ");
			}
			is.close();
		}
		catch(IOException e){
			System.out.print("�쳣");
		}
	}
}
