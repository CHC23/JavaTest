/**
��finally��ر���
1. ���Ȱ���������������try�����棬���������try���棬���������޷��ִ�finally.
2. ��finally�ر�֮ǰ��Ҫ���жϸ������Ƿ�Ϊ��
3. �رյ�ʱ����Ҫ��һ�ν���try catch����

**���Ǳ�׼���Ͻ��Ĺر����ķ�ʽ�����ǿ���ȥ�ܷ���
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class StreamTest6{
	public static void main(String[] args){
		File f=new File("d:/chc/test2.txt");
		FileInputStream fis=null;
		try{
			fis=new FileInputStream(f);
			byte[] all=new byte[(int)f.length()];
			fis.read(all);
			for(byte b:all){
				System.out.println(b);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			//��finally��ر���
			if(fis!=null)
				try{
					fis.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}