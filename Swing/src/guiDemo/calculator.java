package guiDemo;

import javax.swing.*;
import java.awt.*;

public class calculator {
	public static void main(String[] args) {
		
		JFrame jf=new JFrame("计算器");
		jf.setSize(300,500);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		GridLayout layout=new GridLayout(3,3);			//3*3的网格布局
		layout.setHgap(2);								//设置水平间距
		layout.setVgap(2);								//设置垂直间距
			
		
		
		JPanel panel=new JPanel(layout);				//使用网格布局管理器
		
		JButton btn_1=new JButton("1");
		JButton btn_2=new JButton("2");
		JButton btn_3=new JButton("3");
		JButton btn_4=new JButton("4");
		JButton btn_5=new JButton("5");
		JButton btn_6=new JButton("6");
		JButton btn_7=new JButton("7");
		JButton btn_8=new JButton("8");
		JButton btn_9=new JButton("9");
//		JButton btn_1=new JButton("1");
//		JButton btn_1=new JButton("1");
//		JButton btn_1=new JButton("1");
		
		panel.add(btn_1);
		panel.add(btn_2);
		panel.add(btn_3);
		panel.add(btn_4);
		panel.add(btn_5);
		panel.add(btn_6);
		panel.add(btn_7);
		panel.add(btn_8);
		panel.add(btn_9);
		
		jf.setContentPane(panel);
		
		jf.setVisible(true);
	}
}
