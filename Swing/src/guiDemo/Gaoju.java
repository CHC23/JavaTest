package guiDemo;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gaoju extends JFrame{
	
	
	
	
	
	public void startFrame() {
		this.setTitle("一个游戏");
		this.setSize(1200,600);
		this.setLocationRelativeTo(null);			//把窗口绘制在屏幕中央
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//this.addWinodwListener
		this.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		Gaoju test=new Gaoju();
		test.startFrame();
	}
}

class Image{
	
}
