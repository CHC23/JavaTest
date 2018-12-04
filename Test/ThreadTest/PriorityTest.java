//NORM_PRIORITY设置线程优先级:setPriority(Thread.NORM_PRIORITY+x)

public class PriorityTest{
	public static void main(String[] args){
		Thread t1=new Thread(new Thread1());
		Thread t2=new Thread(new Thread2());
		t1.setPriority(Thread.NORM_PRIORITY+5);
		t1.start();
		t2.start();
		
	}
}

class Thread1 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("thread1:"+i);
		}
	}
}

class Thread2 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("thread2*******:"+i);
		}
	}
}