/**\
使用字符流把字符串写入到文件：FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;

public class StreamTest9{
public static void main(String[] args){
		File f=new File("d:/chc/test3.txt");
		//创建基于文件的writer
		try(FileWriter fw=new FileWriter(f)){
			String data="真的好喜欢你";
			char[] ch=data.toCharArray();
			fw.write(ch);
			for(char c:ch){
				System.out.print(c);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}