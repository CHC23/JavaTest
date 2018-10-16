//b����c:/WINDOWS�������ļ��е������ļ����г�������С�ļ�

import java.io.File;
public class FileTest4{
	
	static long minSize=Integer.MAX_VALUE;
	static long maxSize=0;
	static File minFile=null;
	static File maxFile=null;
	
	//�ݹ�����ļ��е����ļ�
	public static void listFiles(File file){
		if(file.isFile()){
			if(file.length()!=0&&file.length()<minSize){
				minFile=file;
				minSize=minFile.length();
			}
			if(file.length()>maxSize){
				maxFile=file;
				maxSize=maxFile.length();
			}
			return;
		}
		if(file.isDirectory()){
			File[] fs=file.listFiles();
			if(fs!=null)
			for(File f:fs){
				listFiles(f);
			}
		}
		
	}
	
	
	public static void main(String[] args){
		File f=new File("c:/windows");
		listFiles(f);
		System.out.printf("����ļ���%s,��СΪ%,d�ֽ�%n",maxFile.getAbsoluteFile(),maxFile.length());
		System.out.printf("��С�ļ���%s,��СΪ%,d�ֽ�%n",minFile.getAbsoluteFile(),minFile.length());
	}
}