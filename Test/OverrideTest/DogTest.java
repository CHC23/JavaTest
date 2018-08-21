//方法重写Override

class Animal{
	public void move(){
		System.out.println("动物能移动");
	}
}

class Dog extends Animal{
	public void move(){
		super.move();				//在子类中调用父类的被重写方法使用super关键字。
		System.out.println("狗能跑和走");
	}
}

public class DogTest{
	public static void main(String[] args){
		Animal a=new Animal();		//Animal对象
		Animal b=new Dog();			//Dog对象
		
		a.move();   			//执行Animal类的方法
		b.move();				//执行Dog的方法
	}
}