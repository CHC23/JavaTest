/**
FileOutputStream()
该类用来创建一个文件并向文件中写数据。
如果该流在打开文件进行输出前，目标文件不存在，那么该流会创建该文件。
*/

import java.io.*;
//创建.txt文件 并把给定的数字以二进制影视写进该文件，并输出到控制台
public class FileStreamTest{
	public static void  main(String[] args){	
		try{
			byte bWrite []={5,2,0};
			OutputStream os=new FileOutputStream("test.txt");
			for(int i=0;i<bWrite.length;i++){
				os.write(bWrite[i]);//写入字节
			}
			os.close();
			InputStream is=new FileInputStream("test.txt");
			int size=is.available();
			for(int i=0;i<size;i++){
				System.out.print((char)is.read()+" ");
			}
			is.close();
		}
		catch(IOException e){
			System.out.print("异常");
		}
	}
}
