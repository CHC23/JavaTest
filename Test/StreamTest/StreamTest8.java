/**
使用字符流读取文件：FileReader 是Reader子类，以FileReader 为例进行文件读取
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest8{
	public static void main(String[] args){
		File f=new File("d:/chc/test3.txt");
		
		//创建基于文件的reader
		try(FileReader fd=new FileReader(f)){
			char[] all=new char[(int)f.length()];
			fd.read(all);
			for(char b:all){
				System.out.print(b);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}