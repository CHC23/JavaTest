//线程之sleep()  ,sleep()方法被中断后，线程也中断

import java.util.*;


public class SleepTest{
	public static void main(String[] args ){
		//Runner r=new Runner();
		//r.run();
		MyThread thread=new MyThread();
		thread.start();
		try{
			Thread.sleep(5000);							//主线程睡眠5s，即run()线程执行5s再执行主线程
		}catch(InterruptedException e){
			e.printStackTrace();
		}thread.interrupt();		//5s之后打断run()线程睡眠	
	}
}

class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println(new Date());
			try{
				sleep(1000);							//此线程睡眠1秒执行，即每个2秒打印一次当前时间
			}catch(InterruptedException e){
				e.printStackTrace();
				return;									//睡眠被中断时结束线程

			}
		}
	}
}