//yield():让其他线程先执行
public class  YieldTest{
	public static void main(String[] args){
		MyThread thread1=new MyThread("线程1");
		MyThread thread2=new MyThread("线程2");
		thread1.start();
		thread2.start();
	} 
}

class MyThread extends Thread{
	MyThread(String s){
		super(s);
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(i+"---"+getName());
			if(i%10==10){
				yield();					//当i%10==10时，当前执行线程让出执行，让下一个排队的线程执行
			}
		}
	}
}