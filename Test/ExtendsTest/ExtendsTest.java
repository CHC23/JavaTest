class Animal{
	private String name;
	private int id;
	public Animal(String name,int id){
		//name=
		this.name=name;
		this.id=id;
	}
	
	public void eat(){
		System.out.println("进食");
	}
	
	public void sleep(){
		System.out.println("睡觉");
	}
	
	public void introduction(){
		System.out.println("我是" +id+"号"+name);
	}
}

class Penguin extends Animal{
	public Penguin(String name,int id){
		super(name,id);   //父类构造器不能继承，如果父类的构造器带有参数，必须在子类的构造器中显式的通过super调用父类的构造器并添加合适的参数列表。
	}
}

class Mouse extends Animal{
	public Mouse(String name,int id){
		super(name,id);
	}
}


public class ExtendsTest{
	public static void main(String[] args){
		Animal animal_1=new Animal("penguin",001);
		Animal animal_2=new Animal("mouse",002);
		//animal_1;
		animal_1.introduction();
		animal_2.introduction();
	}

}