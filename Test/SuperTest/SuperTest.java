public class SuperTest{
	public static void main(String[] args){
		new Student().printName();
	}
}

class School{
	public String name;
	public void printName(){
		name="山西农业大学";
		System.out.println("学校名字："+name);
	}
} 

class Student extends School{
	public String name;
	public void printName(){
		super.printName();       //用super调用父类普通对象
		name="艾斯奥特曼";
		System.out.println("学生名字："+name);
		System.out.println(name);
		System.out.println(super.name);
	}
}