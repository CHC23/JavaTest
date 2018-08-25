package firstgui;

import javax.swing.*;

public class FirstGui {
	public static void main(String[] args) {
		
		JFrame jf= new JFrame("第一个gui");		//创建窗口
		jf.setSize(300,400);
		jf.setLocationRelativeTo(null);			//窗口位置在屏幕中央
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		JPanel panel=new JPanel();				//创建面板容器,使用默认的布局管理器
		
		
		JButton btn=new JButton("按钮");			//创建按钮
		panel.add(btn);							//添加按钮到面板容器
		
		jf.setContentPane(panel);				//把面板容器设置为窗口到顶层窗口
		
		jf.setVisible(true);
	}
}
