//“==”和“equals”区别

public class EqualsTest{
	public static void main(String[] args){
		Student stu_1=new Student("000001","迪迦奥特曼");
		Student stu_2=new Student("000001","艾斯奥特曼");
		System.out.println(stu_1==stu_2);
		System.out.println(stu_1.equals(stu_2));
	}
}

class Student{
	String id;
	String name;
	
	public Student(String id,String name){
		super();
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj) {
		if(this==obj)	
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Student other=(Student) obj;
		if(id!=other.id)
			return false;
		return true;
	}
	
}