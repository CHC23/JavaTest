//ArrayIndexOutOfBoundsException:�Ƿ����������׳����쳣

import java.io.*;
public class ArrayIndexOutOfBoundsExceptionTest{
	public static void main(String[] args){
		try{
			int a[]=new int[5];
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�׳��쳣��"+e);
		}
		System.out.println("�����±�Խ��");
	}
}