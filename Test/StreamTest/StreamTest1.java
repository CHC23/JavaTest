//建立基于文件输入流

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class StreamTest1{
	public static void main(String[] args){
		try{
			//文件chc.txt中内容为AB，ASCII码为65，66
			File f=new File("d:/chc.txt");
			
			//创建基于文件的输入流和输出流
			//FileInputStream fs=new FileInputStream(f);		//通过这个输入流可以把数据从硬盘中读取到java虚拟机中即内存中。
			
			FileOutputStream fs=new FileOutputStream(f); //通过这个输出流可以把数据从内存中输出到硬盘的文件中。
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}