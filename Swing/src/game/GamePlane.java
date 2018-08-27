package game;

import java.awt.*;

public class GamePlane {
	Image img;				//图片对象
	double x,y;				//物体坐标
	int speed;				//物体速度
	int width, height;		//物体所在矩形区域宽度和高度
	
	
	public void dramSelf(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
	}
	
	public GamePlane(Image img,double x,double y) {
		this.img=img;
		this.x=x;
		this.y=y;
		if(img!=null) {
			this.width=img.getWidth(null);
			this.height=img.getHeight(null);
		}
	}
	
	public GamePlane(Image img,double x,double y,int speed,int width,int height) {
		this.img=img;
		this.x=x;
		this.y=y;
		this.speed=speed;
		this.width=width;
		this.height=height;
	}
	
	public GamePlane() {
		
	}
	
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,width,height);
	}
}
