package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;


public class Shell extends GamePlane{
	
	double degree;
	
	public Shell() {
		x=250;
		y=350;
		width=10;
		height=10;
		speed=2;
		
		degree=Math.random()*Math.PI*2;
	}
	
	public void draw(Graphics g) {

		Color c=g.getColor();
		g.setColor(Color.RED);
		g.fillOval((int)x,(int)y,width,height);
		
		x+=speed*Math.cos(degree);				//画出炮弹的各个位置
		y+=speed*Math.sin(degree);

		
		if(x<0||x>Constant.WIDTH-width) {
			degree=Math.PI-degree;
		}
		if(y<30||y>Constant.HEIGHT-height) {
			degree=-degree;
		}
		
		g.setColor(c);
	}
	
	
	
}
