package firstgui;

import javax.swing.*;

public class FirstGui {
	public static void main(String[] args) {
		
		JFrame jf= new JFrame("��һ��gui");		//��������
		jf.setSize(300,400);
		jf.setLocationRelativeTo(null);			//����λ������Ļ����
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		JPanel panel=new JPanel();				//�����������,ʹ��Ĭ�ϵĲ��ֹ�����
		
		
		JButton btn=new JButton("��ť");			//������ť
		panel.add(btn);							//��Ӱ�ť���������
		
		jf.setContentPane(panel);				//�������������Ϊ���ڵ����㴰��
		
		jf.setVisible(true);
	}
}
