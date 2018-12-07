//�����������߳�A��B����Ҫ��������a��b��������ִ�У���ʱA����סa����סb��B����סb����סa���Ͳ���������

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
					System.out.println("�߳�һ����ִ��");
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
					System.out.println("�̶߳�����ִ��");
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