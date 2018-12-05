//synchronized(this):锁住当前对象，即当前线程执行完后再执行下一个线程
public class SynchronizedTest implements Runnable{
	Timer t=new Timer();
	public static void main(String[] args){
		SynchronizedTest st=new SynchronizedTest();
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		t1.setName("线程一");
		t2.setName("线程二");
		t1.start();
		t2.start();
	}
	
	public void run(){
		t.add(Thread.currentThread().getName());
	}
}

class Timer{
	private static int number=0;
	public	synchronized void add(String s){
		//没有使用synchrond()时，会造成线程冲突，即“线程一”执行到number++，睡眠1s时，“线程二”接着执行number++，此时number值为2，
		//即“一”和“二”的number值都为2，
		//synchronized(this);		//锁定当前对象当“线程一”执行完后在执行其他线程。
		number++;
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(s+"是第"+number+"个使用计数器的线程");
	}
}