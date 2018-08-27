package game;

import java.awt.*;

public class GamePlane {
	Image img;				//ͼƬ����
	double x,y;				//��������
	int speed;				//�����ٶ�
	int width, height;		//�������ھ��������Ⱥ͸߶�
	
	
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
