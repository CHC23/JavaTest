//������дOverride

class Animal{
	public void move(){
		System.out.println("�������ƶ�");
	}
}

class Dog extends Animal{
	public void move(){
		super.move();				//�������е��ø���ı���д����ʹ��super�ؼ��֡�
		System.out.println("�����ܺ���");
	}
}

public class DogTest{
	public static void main(String[] args){
		Animal a=new Animal();		//Animal����
		Animal b=new Dog();			//Dog����
		
		a.move();   			//ִ��Animal��ķ���
		b.move();				//ִ��Dog�ķ���
	}
}