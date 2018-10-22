/**
����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
���ֱ�д����ķ�ʽ���� try-with-resources�� ���Ǵ�JDK7��ʼ֧�ֵļ���

���е�������ʵ����һ���ӿڽ��� AutoCloseable���κ���ʵ��������ӿڣ���������try()�н���ʵ������ 
������try, catch, finally������ʱ���Զ��رգ����������Դ��
*/
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamTest7{
	public static void main(String[] args){
		File f=new File("d:/chc/test3.txt");
		try(FileInputStream fis=new FileInputStream(f)){
			byte[] all=new byte[(int)f.length()];
			fis.read(all);
			for(byte b:all){
				System.out.println(b);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}