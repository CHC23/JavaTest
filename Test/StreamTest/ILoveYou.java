/**
���ļ����ݼ���
�����㷨�� 
���֣�
�������9�����֣���ԭ���Ļ����ϼ�1������5���6, 3���4
�����9�����֣����0
��ĸ�ַ���
����Ƿ�z�ַ��������ƶ�һ��������d���e, G���H
�����z��z->a, Z-A��
�ַ���Ҫ������Сд
����ĸ�ַ�
����',&^ �������䣬����Ҳ��������
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
    *            �����ܵ��ļ�
    * @param encodedFile
    *            ���ܺ󱣴��λ��
	*
	*/
	public static void encodeFile(File encodingFile,File encodedFile){
		try(FileReader fd=new FileReader(encodingFile);FileWriter fw=new FileWriter(encodedFile)){
				char[] fileContent=new char[(int) encodingFile.length()];
				fd.read(fileContent);
				System.out.println("����ǰ�����ݣ�");
				System.out.println(new String(fileContent));
				
				//���м���
				encode(fileContent);
				
				//�����������
				System.out.println("���ܺ�����ݣ�");
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
		//�˴�������д����ʹ��Character��idLetterOrDigit()��������Ϊ���Ļᱻ�ж�Ϊ��ĸ
		String letterOrDigital="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		return -1==letterOrDigital.indexOf(c)?false:true;
	}
	
	public static void main(String[] args){
		File encodingFile=new File("D:/chc/test3.txt");
		File encodedFile=new File("D:/chc/test2.txt");
		encodeFile(encodingFile,encodedFile);
	}
}