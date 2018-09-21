//java封装Encapsulation
class Encapsulation{
	private String name;
	private String id;
	private int age;
	
	
	//以下public方法是外部类访问Encapsulation类成员变量的入口。
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public String getId(){
		return id;
	}
	
	public void setAge(int newAge){
		age=newAge;
	}
	
	public void setName(String newName){
		name=newName;
	}
	
	public void setId(String newId){
		id=newId;
	}
}

public class EncapsulationTest{
	public static void main(String[] args){
		Encapsulation encapsulation=new Encapsulation();
		
		encapsulation.setName("艾斯奥特曼");
		encapsulation.setAge(21);
		encapsulation.setId("100001");
		
		System.out.println("姓名："+encapsulation.getName()+"年龄："+encapsulation.getAge()+"学号："+encapsulation.getId());
	}
}