//ArrayIndexOutOfBoundsException:非法访问数组抛出的异常

import java.io.*;
public class ArrayIndexOutOfBoundsExceptionTest{
	public static void main(String[] args){
		try{
			int a[]=new int[5];
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("抛出异常："+e);
		}
		System.out.println("数组下标越界");
	}
}