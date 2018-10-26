/**
		ʹ����������writeUTF()��readUTF() ���Խ������ݵĸ�ʽ��˳���д
		��ͨ��DataOutputStream ���ļ�˳��д�� ����ֵ���������ַ����� Ȼ����ͨ��DataInputStream ˳�������Щ���ݡ�

ע�� 	Ҫ��DataInputStream ��ȡһ���ļ�������ļ���������DataOutputStream д���ģ���������EOFException��
			��ΪDataOutputStream ��д����ʱ�����һЩ�����ǣ�ֻ��DataInputStream ���ܳɹ��Ķ�ȡ��
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
			dos.writeUTF("����֮־ǧ���ĥ����Ľ��Ƥ");
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
			System.out.println("����ֵΪ��"+bool);
			System.out.println("����Ϊ��"+i);
			System.out.println("�ַ�������"+str);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}