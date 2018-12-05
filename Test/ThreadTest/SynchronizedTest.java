//synchronized(this):��ס��ǰ���󣬼���ǰ�߳�ִ�������ִ����һ���߳�
public class SynchronizedTest implements Runnable{
	Timer t=new Timer();
	public static void main(String[] args){
		SynchronizedTest st=new SynchronizedTest();
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		t1.setName("�߳�һ");
		t2.setName("�̶߳�");
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
		//û��ʹ��synchrond()ʱ��������̳߳�ͻ�������߳�һ��ִ�е�number++��˯��1sʱ�����̶߳�������ִ��number++����ʱnumberֵΪ2��
		//����һ���͡�������numberֵ��Ϊ2��
		//synchronized(this);		//������ǰ���󵱡��߳�һ��ִ�������ִ�������̡߳�
		number++;
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(s+"�ǵ�"+number+"��ʹ�ü��������߳�");
	}
}