//�߳�֮sleep()  ,sleep()�������жϺ��߳�Ҳ�ж�

import java.util.*;


public class SleepTest{
	public static void main(String[] args ){
		//Runner r=new Runner();
		//r.run();
		MyThread thread=new MyThread();
		thread.start();
		try{
			Thread.sleep(5000);							//���߳�˯��5s����run()�߳�ִ��5s��ִ�����߳�
		}catch(InterruptedException e){
			e.printStackTrace();
		}thread.interrupt();		//5s֮����run()�߳�˯��	
	}
}

class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println(new Date());
			try{
				sleep(1000);							//���߳�˯��1��ִ�У���ÿ��2���ӡһ�ε�ǰʱ��
			}catch(InterruptedException e){
				e.printStackTrace();
				return;									//˯�߱��ж�ʱ�����߳�

			}
		}
	}
}