/*
InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamTest2{
	public static void main(String[] args){
		try{
			//文件chc.txt的内容为AB，对应ascll码为65和66
			File f=new File("d:/chc.txt");
			//创建基于文件的输入流
			FileInputStream fs=new FileInputStream(f);
			//创建字节数组。长度为文件的长度
			byte[] all=new byte[(int)f.length()];
			//以字节流的形式读取文件内容
			fs.read(all);
			for(byte b:all){
				System.out.println(b);
			}
			
			fs.close();		//使用完流，应该关闭流
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}