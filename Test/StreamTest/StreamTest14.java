/**
Ҫ��
��һ�ַ�ʽ�� ʹ�û������������������ַ�������ʽд���ļ�����û��������ַ�������ʽ��ȡ������Ȼ��ת��Ϊ�������֡� 
ע�� ��������֮��Ҫ�зָ��������������������֡� ����������31��15�������ʹ�÷ָ�������ô����3115����ȡ�������޷�ʶ�𵽵������������֡� ʹ�÷ָ���31@15�ܽ��������⡣

�ڶ��ַ�ʽ�� ʹ��������DataOutputStream���ļ�����д���������֣�Ȼ����DataInpuStream������ȡ��������
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
			stream1();		//��������ʽ
			stream2();		//��������ʽ
		
	}
	
	private static void stream1(){
		try(FileInputStream fis=new FileInputStream(f);DataInputStream dis=new DataInputStream(fis);
				FileOutputStream fos=new FileOutputStream(f);DataOutputStream dos=new DataOutputStream(fos)){
					dos.writeInt(X);
					dos.writeInt(Y);
					int X=dis.readInt();
					int Y=dis.readInt();
					System.out.printf("����������������X��%d,Y��%d%n",X,Y);
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
					System.out.printf("ʹ������������������X��%d,Y��%d%n",X,Y);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}