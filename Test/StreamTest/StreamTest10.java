//缓存字符输入流BufferedReader可以一次读取一行数据

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StreamTest10{
	public static void main(String[] args){
		File f=new File("d:/chc/test3.txt");
		
		//创建文件字符流
		//缓存流必须建立在一个流的基础上
		try(FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);)
				{
					while(true){
						//一次读一行
						String line=br.readLine();
						if(line==null)
							break;
						System.out.println(line);
					}
				}
				catch(IOException e){
					e.printStackTrace();
				}
	}
}