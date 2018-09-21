/**
System.in控制台输入  用法：BufferedReader br=new BufferedReader(new inputSteramReader(System.in));

从bufferedReader对象读取字符使用read()方法     用法：int read() throws IOException
每次调用read()方法，它从输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回-1。该方法抛出IOException。
*/
import java.io.*;

public  class SystemInTest{
	public static void main(String []args ) throws IOException{
		char c;
		//使用System.in创建BufferedReader对象
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按‘q’退出。");
		//读取字符
		do{
			c=(char)br.read();
			System.out.println(c);
			
		}while(c!='q');
	}
}