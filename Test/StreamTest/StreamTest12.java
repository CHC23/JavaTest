//flush()可以立即将数据写入硬盘  不必等缓存装满

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamTest12{
	public static void main(String[] args){
		File f=new File("d:/chc/test5.txt");
		try(FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw)){
			pw.println("技讲教头林家枪");
				pw.flush();						//强制把缓存中的数据写入硬盘   无论内存是否已满
			pw.println("胆有白马常山将");
			pw.println("力图霸王别乌江");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}