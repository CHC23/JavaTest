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
		System.out.println("学习java。");
	}
	
	void exercise()
	{
		System.out.println("打"+exer.kind);
	}
	
	public static void main(String[] args)
	{
		StudentClass stu=new StudentClass();
		Exercise exe=new Exercise();
		
		stu.name="科比";
		stu.Sid=24;
		stu.age=40;
		stu.dept="洛杉矶湖人";
		stu.sex="男";
		exe.kind="篮球";
		
		stu.exer=exe;
		stu.exercise();
	}
}

class Exercise
{
	String kind;
}