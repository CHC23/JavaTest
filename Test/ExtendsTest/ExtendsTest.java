class Animal{
	private String name;
	private int id;
	public Animal(String name,int id){
		//name=
		this.name=name;
		this.id=id;
	}
	
	public void eat(){
		System.out.println("��ʳ");
	}
	
	public void sleep(){
		System.out.println("˯��");
	}
	
	public void introduction(){
		System.out.println("����" +id+"��"+name);
	}
}

class Penguin extends Animal{
	public Penguin(String name,int id){
		super(name,id);   //���๹�������ܼ̳У��������Ĺ��������в���������������Ĺ���������ʽ��ͨ��super���ø���Ĺ���������Ӻ��ʵĲ����б�
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