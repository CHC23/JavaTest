//flush()��������������д��Ӳ��  ���صȻ���װ��

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamTest12{
	public static void main(String[] args){
		File f=new File("d:/chc/test5.txt");
		try(FileWriter fw=new FileWriter(f);PrintWriter pw=new PrintWriter(fw)){
			pw.println("������ͷ�ּ�ǹ");
				pw.flush();						//ǿ�ưѻ����е�����д��Ӳ��   �����ڴ��Ƿ�����
			pw.println("���а���ɽ��");
			pw.println("��ͼ�������ڽ�");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}