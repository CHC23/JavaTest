//jion()����ʵ���̺߳ϲ�

public class JoinTest{
	public static void main(String[] args){
		MyThread thread=new MyThread("run()�߳�");
		thread.start();
		try{
			thread.join();												//�̺߳ϲ�������run()�̺߳ϲ������̣߳�ִ����run()�߳��ٽ���ִ�����߳�
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i=0;i<=10;i++){
			System.out.println("���߳�");
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