/**
		使用数据流的writeUTF()和readUTF() 可以进行数据的格式化顺序读写
		如通过DataOutputStream 向文件顺序写出 布尔值，整数和字符串。 然后再通过DataInputStream 顺序读入这些数据。

注： 	要用DataInputStream 读取一个文件，这个文件必须是由DataOutputStream 写出的，否则会出现EOFException，
			因为DataOutputStream 在写出的时候会做一些特殊标记，只有DataInputStream 才能成功的读取。
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.IOException;

public class StreamTest13{
	public static void main(String[] args){
		write();
		read();
	}
	
	private static void write(){
		File f=new File("D:/chc/test6.txt");
		
		try(FileOutputStream fos=new FileOutputStream(f);DataOutputStream dos=new DataOutputStream(fos);){
			dos.writeBoolean(true);
			dos.writeInt(1024);
			dos.writeUTF("鸿鹄之志千万里，磨练你的筋骨皮");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private static void read(){
		File f=new File("D:/chc/test6.txt");
		
		try(FileInputStream fis=new FileInputStream(f);DataInputStream dis=new DataInputStream(fis)){
			boolean bool=dis.readBoolean();
			int i=dis.readInt();
			String str=dis.readUTF();
			System.out.println("布尔值为："+bool);
			System.out.println("整数为："+i);
			System.out.println("字符数串："+str);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}