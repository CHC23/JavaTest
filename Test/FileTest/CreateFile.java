//使用绝对路径或相对路径创建file对象

import java.io.File;

public class CreateFile{
	public static void main(String[] args){
		//绝对路径
		File f1=new File("d:/chc");
		System.out.println("f1的绝对路径："+f1.getAbsolutePath());	
		//相对路径
		File f2=new File("/hello.txt");
		System.out.println("f2的绝对路径："+f2.getAbsolutePath());
		//f1作为父目录创建文件对象
		File f3=new File(f1,"hello.txt");
		System.out.println("f3的绝对路径："+f3.getAbsolutePath());
	}
}