//b遍历c:/WINDOWS盘下所有文件，列出最大和最小文件

import java.io.File;


public class FileTest3{
	public static void main(String[] args){
		
		File f=new File("c://windows");
		File[] fs=f.listFiles();
		if(fs==null)
			return;
		long minSize=Integer.MAX_VALUE;
		long maxSize=0;
		File minFile=null;
		File maxFile=null;
		for(File file:fs){
			if(file.isDirectory())
				continue;
			if(file.length()>maxSize){
				maxSize=file.length();
				maxFile=file;
			}
			if(file.length()!=0&&file.length()<minSize){
				minSize=file.length();
				minFile=file;
			}
		}
		
		System.out.printf("最大文件是%s,大小是%,d字节\n",maxFile.getAbsoluteFile(),maxFile.length());
		System.out.printf("最小文件是%s,大小是%,d字节",minFile.getAbsoluteFile(),minFile.length());
	}
}