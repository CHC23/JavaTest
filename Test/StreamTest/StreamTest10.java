//�����ַ�������BufferedReader����һ�ζ�ȡһ������

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest10{
	public static void main(String[] args){
		File f=new File("d:/chc/test3.txt");
		
		//�����ļ��ַ���
		//���������뽨����һ�����Ļ�����
		try(FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);)
				{
					while(true){
						//һ�ζ�һ��
						String line=br.readLine();
						if(line==null)
							break;
						System.out.println(line);
					}
				}
				catch(IOException e){
					e.printStackTrace();
				}
	}
}