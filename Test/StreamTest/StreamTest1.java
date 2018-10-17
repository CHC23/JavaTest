//建立基于文件输入流

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class StreamTest1{
	public static void main(String[] args){
		try{
			//文件chc.txt中内容为AB，ASCII码为65，66
			File f=new File("d:/chc.txt");
			
			//创建基于文件的输入流
			FileInputStream fs=new FileInputStream(f);
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}