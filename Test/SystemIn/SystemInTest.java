/**
System.in����̨����  �÷���BufferedReader br=new BufferedReader(new inputSteramReader(System.in));

��bufferedReader�����ȡ�ַ�ʹ��read()����     �÷���int read() throws IOException
ÿ�ε���read()������������������ȡһ���ַ����Ѹ��ַ���Ϊ����ֵ���ء� ����������ʱ�򷵻�-1���÷����׳�IOException��
*/
import java.io.*;

public  class SystemInTest{
	public static void main(String []args ) throws IOException{
		char c;
		//ʹ��System.in����BufferedReader����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����ַ�������q���˳���");
		//��ȡ�ַ�
		do{
			c=(char)br.read();
			System.out.println(c);
			
		}while(c!='q');
	}
}