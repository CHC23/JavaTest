interface InterfaceA{						//定义一个接口A
	public static final String A="接口A";	//全局变量变量	
	public abstract void print();			//定义抽象方法
}

interface InterfaceB{						//定义接口B
	public abstract void get();				//抽象方法
}

class ClassC implements InterfaceA,InterfaceB{				//ClassC类实现以上两个接口
	public void print(){
		System.out.println("实现InterfaceA的抽象方法print()");
	}

	public void get(){
		System.out.println("实现InterfaceB的抽象方法get()");
	} 	
}

public class InterfaceTest{
	public static void main(String[] args){
		ClassC classc=new ClassC();
		InterfaceA A=classc;		//向上转型
		InterfaceB B=classc;		//向上转型	
		
		A.print();
		B.get();
	}
}