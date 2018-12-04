//jion()方法实现线程合并

public class JoinTest{
	public static void main(String[] args){
		MyThread thread=new MyThread("run()线程");
		thread.start();
		try{
			thread.join();												//线程合并，即把run()线程合并到主线程，执行完run()线程再接着执行主线程
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i=0;i<=10;i++){
			System.out.println("主线程");
		}
	}
}

class MyThread extends Thread{
	MyThread(String s){
		super(s);
	}
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println(getName());
			try{
				sleep(1000);
			}catch(InterruptedException e){
				
				e.printStackTrace();
				return;
			}
		}
	}
}