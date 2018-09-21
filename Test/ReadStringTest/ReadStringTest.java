
//从标准输入读取一个字符串需要使用BufferedReader的readLine()方法  用法：String readLine() throws IOException

import java.io.*;

public class ReadStringTest{
	public static void main(String[] args) throws IOException{
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("出入一个字符串，按‘end’退出");
		do{
			str=br.readLine();
			System.out.print(str);
		}while(!str.equals("end"));
	}
	
}