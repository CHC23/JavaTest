//yield():�������߳���ִ��
public class  YieldTest{
	public static void main(String[] args){
		MyThread thread1=new MyThread("�߳�1");
		MyThread thread2=new MyThread("�߳�2");
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
				yield();					//��i%10==10ʱ����ǰִ���߳��ó�ִ�У�����һ���Ŷӵ��߳�ִ��
			}
		}
	}
}