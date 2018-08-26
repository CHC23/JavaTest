package game;

import javax.swing.*;
import java.awt.*;

public class FirstGameTest extends JFrame{
	
	public void paint(Graphics g) {
		g.drawLine(300, 300, 400, 600);
	}
	
	
	
	public void startFrame() {
		this.setTitle("Ò»¸öÓÎÏ·");
		this.setSize(500,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//this.addWinodwListener
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		FirstGameTest test=new FirstGameTest();
		test.startFrame();
	}
}
