//方法的重载Overload
//常用于构造器的重载

public class Overloading{
	public int test(){						//无参
		System.out.println("test1");
		return 1;
	}
	
	public void test(int a){				//有参
		System.out.println("test2");
	}
	
	public String test(int a,String s){		//参数类型顺序不同
		System.out.println("test3");
		return "returntest3";
	}
	
	public String test(String s,int a){
		System.out.println("test4");
		return "returntest4";
	}
	
	public static void main(String[] args){
		Overloading o=new Overloading();
		System.out.println(o.test());
		o.test(1);
		System.out.println(o.test(1,"test3"));
		System.out.println(o.test("test4",1));
	}
}
