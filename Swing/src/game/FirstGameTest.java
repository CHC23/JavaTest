package game;

import javax.swing.*;
import java.awt.*;

public class FirstGameTest extends JFrame{
	
	Image back=GameUtil.getImage("images/back.jpg");
	Image plane=GameUtil.getImage("images/2.png");
	int x=200,y=450;
	
	public void paint(Graphics g) {
		g.drawImage(back,0,0,null);
		g.drawImage(plane,x,y,null);
		x=x+10;
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
	
	public void startFrame() {
		this.setTitle("一个游戏");
		this.setSize(500,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//this.addWinodwListener
		this.setVisible(true);
		
		new PaintThread().run();			//启动重画窗口的线程
	}
	
	public static void main(String[] args) {
		FirstGameTest test=new FirstGameTest();
		test.startFrame();
	}
}
