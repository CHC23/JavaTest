package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class Shell extends GamePlane{
	
	double degree;
	
	public Shell(Image img,double x,double y,int speed) {
//		x=250;
//		y=350;
//		width=10;
//		height=10;
		speed=200;
		
		this.img=img;
		this.x=x;
		this.y=y;
		this.speed=speed;
		
		degree=Math.random()*Math.PI*2;
	}
	
	public void draw(Graphics g) {
		g.drawImage(img, (int)x, (int)y, null);
//		Color c=g.getColor();
//		g.getColor();
//		g.fillOval((int)x,(int)y,width,height);
		
		x+=speed*Math.cos(degree);				//画出炮弹的各个位置
		y+=speed*Math.sin(degree);

		
		if(x<width||x>Constant.WIDTH-width) {
			degree=Math.PI-degree;
		}
		if(y<height+30||y>Constant.HEIGHT-height) {
			degree=-degree;
		}
		
//		g.setColor(c);
	}
	
	
	
}
