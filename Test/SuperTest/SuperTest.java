public class SuperTest{
	public static void main(String[] args){
		new Student().printName();
	}
}

class School{
	public String name;
	public void printName(){
		name="ɽ��ũҵ��ѧ";
		System.out.println("ѧУ���֣�"+name);
	}
} 

class Student extends School{
	public String name;
	public void printName(){
		super.printName();       //��super���ø�����ͨ����
		name="��˹������";
		System.out.println("ѧ�����֣�"+name);
		System.out.println(name);
		System.out.println(super.name);
	}
}