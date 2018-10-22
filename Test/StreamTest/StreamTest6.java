/**
在finally里关闭流
1. 首先把流的引用声明在try的外面，如果声明在try里面，其作用域无法抵达finally.
2. 在finally关闭之前，要先判断该引用是否为空
3. 关闭的时候，需要再一次进行try catch处理

**这是标准的严谨的关闭流的方式，但是看上去很繁琐
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class StreamTest6{
	public static void main(String[] args){
		File f=new File("d:/chc/test2.txt");
		FileInputStream fis=null;
		try{
			fis=new FileInputStream(f);
			byte[] all=new byte[(int)f.length()];
			fis.read(all);
			for(byte b:all){
				System.out.println(b);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			//在finally里关闭流
			if(fis!=null)
				try{
					fis.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}