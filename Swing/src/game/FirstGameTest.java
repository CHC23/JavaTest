package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstGameTest extends JFrame{
	
	Image backImg=GameUtil.getImage("images/back.jpg");
	Image planeImg=GameUtil.getImage("images/2.png");
	
	Plane plane=new Plane(planeImg,250,350,2);
	
	public void paint(Graphics g) {
		g.drawImage(backImg,0,0,null);
//		g.drawImage(planeImg,300,350,null);
		plane.drawSelf(g);
		
		
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
		//键盘控制飞机移动
		
		//按下键
		public void keyPressed(KeyEvent e) {
			plane.keyUp(e);
		}
		
		//松开建
		public void keyRelesaed(KeyEvent e) {
			plane.keyDown(e);
		}
	}
	
	public void startFrame() {
		this.setTitle("一个游戏");
		this.setSize(500,700);
		this.setLocationRelativeTo(null);			//把窗口绘制在屏幕中央
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//this.addWinodwListener
		this.setVisible(true);
		
		new PaintThread().start();			//启动重画窗口的线程
		addKeyListener(new KeyMonitor());	//键盘监听
		
	}
	
	public static void main(String[] args) {
		FirstGameTest test=new FirstGameTest();
		test.startFrame();
	}
}
