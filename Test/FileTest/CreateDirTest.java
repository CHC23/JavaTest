/**
File���������������������������ļ��У�

mkdir( )��������һ���ļ��У��ɹ��򷵻�true��ʧ���򷵻�false��ʧ�ܱ���File����ָ����·���Ѿ����ڣ�������������·���������ڣ����ļ��в��ܱ�������

mkdirs()��������һ���ļ��к��������и��ļ��С�
*/

import java.io.*;

public class CreateDirTest{
	public static void main(String[] args){
		String dirname="/d/filetext";
		File d=new File(dirname);
		
		d.mkdirs();
	}
}