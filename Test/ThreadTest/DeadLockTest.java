//死锁：两个线程A，B都需要锁定对象a，b才能完整执行，这时A先锁住a再锁住b，B先锁住b再锁住a，就产生了死锁

public class DeadLockTest implements Runnable{
	private int flag=1;
	static Object obj1=new Object();
	static Object obj2=new Object();
	public void run(){
		System.out.println("flag="+flag);
		if(flag==1){
			synchronized(obj1){
				try{
					Thread.sleep(5000);
				}catch(Exception e){
					e.printStackTrace();
				}
				synchronized(obj2){
					System.out.println("线程一完整执行");
				}
			}
		}
		
		if(flag==0){
			synchronized(obj2){
				try{
					Thread.sleep(5000);
				}catch(Exception e){
					e.printStackTrace();
				}
				synchronized(obj1){
					System.out.println("线程二完整执行");
				}
			}
		}
	}
	
	public static void main(String[] args){
		DeadLockTest lock1=new DeadLockTest();
		DeadLockTest lock2=new DeadLockTest();
		lock1.flag=1;
		lock2.flag=0;
		Thread t1=new Thread(lock1);
		Thread t2=new Thread(lock2);
		t1.start();
		t2.start();
	}
	
}