//b遍历c:/WINDOWS盘下子文件夹的所有文件，列出最大和最小文件

import java.io.File;
public class FileTest4{
	
	static long minSize=Integer.MAX_VALUE;
	static long maxSize=0;
	static File minFile=null;
	static File maxFile=null;
	
	//递归遍历文件夹的子文件
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
		System.out.printf("最大文件是%s,大小为%,d字节%n",maxFile.getAbsoluteFile(),maxFile.length());
		System.out.printf("最小文件是%s,大小为%,d字节%n",minFile.getAbsoluteFile(),minFile.length());
	}
}