/**
���ֽ�������ʽд�����ݵ�d:/chc/chc1/test1.txt
chc1�ļ��в������� ����Ҫ�Զ�����
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest5{
	
			public static void main(String[] args){
				try{
					File f=new File("d:/chc/chc1/test1.txt");		//һ�������d:/chc/chc1�ļ��в������ڣ����Ի����ʧ�ܣ���Ҫ�Զ���������ļ���
				
				//���Ȼ�ȡ�ļ�����Ŀ¼Ŀ¼
				File dir=f.getParentFile();
				//�ж��Ƿ���ڸ�Ŀ¼����������ڣ���Ҫ����
				if(!dir.exists()){
					dir.mkdir();	//�����Ŀ¼�ĸ�Ŀ¼Ҳ�����ڣ���ʹ��mkdir()���׳��쳣����Ҫʹ��mkdirs()
					
				}
				
				//���������Ƕ����ֽ����飬��88,89��ʼ������Ӧ���ַ���X,Y.
				byte data[]={88,89};
				FileOutputStream fo=new FileOutputStream(f);
				fo.write(data);		//д���ļ�
				fo.close();		//�ر���
				}
				catch (IOException e){
					e.printStackTrace();
				}
		}
	}