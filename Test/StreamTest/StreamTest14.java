/**
要求
第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。 
注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。

第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.PrintWriter;

public class StreamTest14{
	static File f=new File("D:/chc/test7.txt");
	static int X=520;
	static int Y=1314;
	
	public static void main(String[] args){
			stream1();		//缓存流方式
			stream2();		//数据流方式
		
	}
	
	private static void stream1(){
		try(FileInputStream fis=new FileInputStream(f);DataInputStream dis=new DataInputStream(fis);
				FileOutputStream fos=new FileOutputStream(f);DataOutputStream dos=new DataOutputStream(fos)){
					dos.writeInt(X);
					dos.writeInt(Y);
					int X=dis.readInt();
					int Y=dis.readInt();
					System.out.printf("缓存流方法读出的X是%d,Y是%d%n",X,Y);
			}
			catch(IOException e){
				e.printStackTrace();
		}
	}
	
	private static void stream2(){
		try(FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw);
				FileReader fr=new FileReader(f);BufferedReader br=new BufferedReader(fr)){
					pw.print(X+"@"+Y);
					pw.flush();
					String str=br.readLine();
					String[] s=str.split("@");
					int X=Integer.parseInt(s[0]);
					int Y=Integer.parseInt(s[1]);
					System.out.printf("使用数据流方法读出的X是%d,Y是%d%n",X,Y);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}