
//�ӱ�׼�����ȡһ���ַ�����Ҫʹ��BufferedReader��readLine()����  �÷���String readLine() throws IOException

import java.io.*;

public class ReadStringTest{
	public static void main(String[] args) throws IOException{
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("����һ���ַ���������end���˳�");
		do{
			str=br.readLine();
			System.out.print(str);
		}while(!str.equals("end"));
	}
	
}