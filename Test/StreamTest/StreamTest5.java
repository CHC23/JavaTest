/**
以字节流的形式写入数据到d:/chc/chc1/test1.txt
chc1文件夹并不存在 ，需要自动创建
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest5{
	
			public static void main(String[] args){
				try{
					File f=new File("d:/chc/chc1/test1.txt");		//一般情况下d:/chc/chc1文件夹并不存在，所以会输出失败，需要自动创建这个文件夹
				
				//首先获取文件所在目录目录
				File dir=f.getParentFile();
				//判断是否存在该目录，如果不存在，需要创建
				if(!dir.exists()){
					dir.mkdir();	//如果此目录的父目录也不存在，则使用mkdir()会抛出异常，需要使用mkdirs()
					
				}
				
				//创建长度是二的字节数组，用88,89初始化，对应的字符是X,Y.
				byte data[]={88,89};
				FileOutputStream fo=new FileOutputStream(f);
				fo.write(data);		//写入文件
				fo.close();		//关闭流
				}
				catch (IOException e){
					e.printStackTrace();
				}
		}
	}