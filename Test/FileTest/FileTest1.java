//文件常用方法1
//需要在d:\chc确实存在一个hello.txt,\r\n才可以看到对应的文件长度、修改时间等信息

import java.io.File;
import java.util.*;

public class FileTest1{
	public static void main(String[] args){
		File f=new File("d:/chc/hello.txt");
		System.out.println("当前文件是："+f);
		
		//判断文件是否存在
		System.out.println("文件是否存在："+f.exists());
		
		//判断是否是文件夹
		System.out.println("是否是文件夹："+f.isDirectory());
		
		//判断是否是文件夹
		System.out.println("是否是文件："+f.isFile());
		
		//获取文件长度
		System.out.println("文件长度为："+f.length());
		
		//获取文件最后修改时间
		long time=f.lastModified();
		Date d=new Date(time);
		System.out.println("文件最后修改时间为："+d);
		
		//修改最后修改时间为时间为2018.10.9 22：30：00
		Calendar c = Calendar.getInstance();
        c.set(2018, 10,9, 22, 30, 0);
		f.setLastModified(c.getTimeInMillis());
		
		//文件重命名 ：renameTo方法用于对物理文件名称进行修改，但是并不会修改File对象的name属性。
		File f1=new File("d:/chc/helloworld.txt");
		f.renameTo(f1);
		System.out.println("hello.txt重命名为helloworld.txt");
	}
}