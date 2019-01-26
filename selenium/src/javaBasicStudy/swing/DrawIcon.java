package com.javaBasicStudy.swing;
import java.awt.*;

import  javax.swing.*;
//����ͼ�� ʵ��Icon�ӿ�
public class DrawIcon implements Icon{
	private int width;
	private int height;

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		// TODO �Զ����ɵķ������
		arg1.fillOval(x, y, width, height);
	}

	@Override
	public int getIconWidth() {
		// TODO �Զ����ɵķ������
		return this.width;
	}

	@Override
	public int getIconHeight() {
		// TODO �Զ����ɵķ������
		return this.height;
	}
	public DrawIcon(int width,int height){
		this.width=width;
		this.height=height;
	}
	public static void main(String[] args) {
		DrawIcon icon=new DrawIcon(15,5);
		JLabel j=new JLabel("����",icon,SwingConstants.CENTER);
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		c.add(j);
		jf.setBackground(Color.WHITE);
		jf.setVisible(true);
		jf.setSize(320, 240);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
}
