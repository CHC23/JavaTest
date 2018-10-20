/**OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamTest3{
	public static 	void main(String[] args){
		try{
			File f=new File("d:/chc/test1.txt");     //创建空文件。
			//创建长度是二的字节数组，用88,89初始化，对应的字符是X,Y.
			byte data[]={88,89};
			//创建基于文件的输出流
			FileOutputStream fo=new FileOutputStream(f);
			//把数据写入输出流
			fo.write(data);
			//关闭流
			fo.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}