//shutDown():�߳̽����ķ���

public class ShutDownTest{
	public static void main(String[] args){
		Runner r=new Runner();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10000;i++){
			if(i%10==0&&i>0){
				System.out.println("���̵߳�iΪ��"+i);
			}
		}
		r.shutDown();							//	���߳�i=9990ʱ��run()��������ʱ�߳̽���
		System.out.println("���߳̽���");
		
	} 
}

class Runner implements Runnable{
	private boolean flag=true;
	
	public void run(){
		int i=0;
		while(flag==true){
			System.out.println("------"+i++);
		}
	}
	
	public void shutDown(){						
		flag=false;
	}
}