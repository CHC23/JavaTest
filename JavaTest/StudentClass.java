public class StudentClass
{
	String name;
	int Sid;
	int age;
	String dept;
	String sex;
	Exercise exer;
	
	void study()
	{
		System.out.println("ѧϰjava��");
	}
	
	void exercise()
	{
		System.out.println("��"+exer.kind);
	}
	
	public static void main(String[] args)
	{
		StudentClass stu=new StudentClass();
		Exercise exe=new Exercise();
		
		stu.name="�Ʊ�";
		stu.Sid=24;
		stu.age=40;
		stu.dept="��ɼ����";
		stu.sex="��";
		exe.kind="����";
		
		stu.exer=exe;
		stu.exercise();
	}
}

class Exercise
{
	String kind;
}