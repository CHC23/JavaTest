//shutDown():线程结束的方法

public class ShutDownTest{
	public static void main(String[] args){
		Runner r=new Runner();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10000;i++){
			if(i%10==0&&i>0){
				System.out.println("主线程的i为："+i);
			}
		}
		r.shutDown();							//	主线程i=9990时，run()结束，此时线程结束
		System.out.println("主线程结束");
		
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