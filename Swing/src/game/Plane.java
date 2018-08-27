package game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Plane extends GamePlane{
	int speed=2;
	boolean left,right,up,down;
	
	
	public void drawSelf(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
		if(left) {
			x-=speed;
		}
		if(right) {
			x+=speed;
		}
		if(up) {
			y-=speed;
		}
		if(down) {
			y+=speed;
		}
	}
	
	public Plane(Image img,double x,double y,int speed) {
		this.img=img;
		this.x=x;
		this.y=y;
//		this.speed=speed;
		
	}
	
	
	//按下键，移动飞机
	public void keyUp(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left=true;
			break;
		case KeyEvent.VK_RIGHT:
			right=true;
			break;
		case KeyEvent.VK_UP:
			up=true;
			break;
		case KeyEvent.VK_DOWN:
			down=true;
			break;
		default:
			break;
		}
	}
	
	//松开键，飞机停止移动
	public void keyDown(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left=false;
			break;
		case KeyEvent.VK_RIGHT:
			right=false;
			break;
		case KeyEvent.VK_UP:
			up=false;
			break;
		case KeyEvent.VK_DOWN:
			down=false;
			break;
		default:
			break;
		}
	}
	
}
