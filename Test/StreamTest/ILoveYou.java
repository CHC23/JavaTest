/**
给文件内容加密
加密算法： 
数字：
如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
如果是9的数字，变成0
字母字符：
如果是非z字符，向右移动一个，比如d变成e, G变成H
如果是z，z->a, Z-A。
字符需要保留大小写
非字母字符
比如',&^ 保留不变，中文也保留不变
*/

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;


public class ILoveYou{
	/**
	*
	*
	*@param encodingFile
    *            被加密的文件
    * @param encodedFile
    *            加密后保存的位置
	*
	*/
	public static void encodeFile(File encodingFile,File encodedFile){
		try(FileReader fd=new FileReader(encodingFile);FileWriter fw=new FileWriter(encodedFile)){
				char[] fileContent=new char[(int) encodingFile.length()];
				fd.read(fileContent);
				System.out.println("加密前的内容：");
				System.out.println(new String(fileContent));
				
				//进行加密
				encode(fileContent);
				
				//保存加密内容
				System.out.println("加密后的内容：");
				System.out.println(new String(fileContent));
				
				fw.write(fileContent);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private static void encode(char[] fileContent){
		for(int i=0;i<fileContent.length;i++){
			char c=fileContent[i];
			if(isLetterOrDigit(c)){
				switch(c){
					case '9':
						c='0';
						break;
					case 'z':
						c='a';
						break;
					case 'Z':
						c='A';
						break;
					default:
						c++;
						break;
						
				}
			}
			fileContent[i]=c;
		}
	}
	
	public static boolean isLetterOrDigit (char c){
		//此处方法重写，不使用Character的idLetterOrDigit()方法是因为中文会被判断为字母
		String letterOrDigital="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return -1==letterOrDigital.indexOf(c)?false:true;
	}
	
	public static void main(String[] args){
		File encodingFile=new File("D:/chc/test3.txt");
		File encodedFile=new File("D:/chc/test2.txt");
		encodeFile(encodingFile,encodedFile);
	}
}