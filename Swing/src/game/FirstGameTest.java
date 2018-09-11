package game;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class FirstGameTest extends JFrame{
	
	Image backImg=GameUtil.getImage("images/back.jpg");
	Image planeImg=GameUtil.getImage("images/2.png");
	Plane plane=new Plane(planeImg,220,650,20);
	Shell[] shell=new Shell[20];
	Explode beng;
	Date startTime=new Date();
	Date endTime;
	int gameTime;
	
	
	public void paint(Graphics g) {
		Color c=g.getColor();
		
		g.drawImage(backImg,0,0,null);
//		g.drawImage(planeImg,300,350,null);
		plane.drawSelf(g);

		for(int i=0;i<shell.length;i++){
			shell[i].draw(g);
			if(shell[i].getRect().intersects(plane.getRect())) {
				plane.live=false;
				
				if(beng==null) {
					beng=new Explode(plane.x,plane.y);
					
					endTime=new Date();
					gameTime=(int)((endTime.getTime()-startTime.getTime())/1000);
				}
				beng.draw(g);
			}
			if(!plane.live) {
				g.setColor(Color.black);
//				Font f=new Font("����",Font.BOLD,10);
//				g.setFont(f);
				g.drawString("���ʱ�䣺"+gameTime+"��", 200, 100);
			
			}
			
		}
		g.setColor(c);
		
}
	
	class PaintThread extends Thread{
		
		@Override
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	class KeyMonitor extends KeyAdapter{
		//���̿��Ʒɻ��ƶ�
		
		//���¼�
		public void keyPressed(KeyEvent e) {
			plane.keyUp(e);
		}
		
		//�ɿ���
		public void keyReleased(KeyEvent e) {
			plane.keyDown(e);
		}
	}
	
	public void startFrame() {
		this.setTitle("һ����Ϸ");
		this.setSize(Constant.WIDTH,Constant.HEIGHT);
		this.setLocationRelativeTo(null);			//�Ѵ��ڻ�������Ļ����
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//this.addWinodwListener
		this.setVisible(true);
		
		for(int i=0;i<shell.length;i++) {
				shell[i]=new Shell();
			}
		
		new PaintThread().start();			//�����ػ����ڵ��߳�
		addKeyListener(new KeyMonitor());	//���̼���
		
	}
	
	public static void main(String[] args) {
		FirstGameTest test=new FirstGameTest();
		test.startFrame();
	}
}

//ǰ�������·������Ъ���