//file常用方法2

import java.io.File;
import java.io.IOException;

public class FileTest2{
	public static void main(String[] args) throws IOException{
		File f=new File("d:/chc/test/hello.txt");
		//以字符串数组的形式返回当前目录下的所有文件（不包含子文件和子文件夹）
		f.list();
		//以文件数组的形式返回当前目录下的所有文件（不包含子文件和子文件夹）
		File[] fs=f.listFiles();
		
		//以字符串形式返回获取所在文件夹
		f.getParent();
		
		//以文件形式返回获取所在文件夹
		f.getParentFile();
		
		//创建文件夹，如果父文件夹test不存在，则创建无效
		f.mkdir();
		
		//创建文件夹，如果父文件夹test不存在，则创建test父文件夹。
		f.mkdirs();
		
		//创建一个空文件夹，如果父文件夹test不存在，则抛出异常
		f.createNewFile();
		
		//创建一个空文件夹之前，通常都会创建父文件夹
		f.getParentFile().mkdirs();
		
		//列出所有的盘符
		f.listRoots();
		
		//删除文件
		f.delete();
		
		//jvm结束时删除文件，通常用于临时文件
		f.deleteOnExit();
	}
}