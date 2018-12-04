//线程测试

public class  ThreadTest1{
	public static void main(String[] args){
		Runner1 r=new Runner1();
		r.run();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<100;i++){
			System.out.println("主线程："+i);
		}
	}
} 

class Runner1 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("线程Runner1："+i);
		}
		
	}
}