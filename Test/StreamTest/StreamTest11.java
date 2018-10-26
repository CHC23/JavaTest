//PrintWriter()缓存字符输出流    可以一次写出一行数据

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamTest11{
	public static void main(String[] args){
		File f=new File("D:/chc/test1.txt");
		
		try(
			FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw);	//创建文件字符流    缓存流必须建立在一个存在的流上
			){
			pw.println("是你给了我一把伞");
			pw.println("撑住倾盆洒落的孤单");
			pw.println("你却在终点等我住进你的心里");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}