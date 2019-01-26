package com.javaBasicStudy.swing;
import java.awt.*;

import  javax.swing.*;
//创建图标 实现Icon接口
public class DrawIcon implements Icon{
	private int width;
	private int height;

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		// TODO 自动生成的方法存根
		arg1.fillOval(x, y, width, height);
	}

	@Override
	public int getIconWidth() {
		// TODO 自动生成的方法存根
		return this.width;
	}

	@Override
	public int getIconHeight() {
		// TODO 自动生成的方法存根
		return this.height;
	}
	public DrawIcon(int width,int height){
		this.width=width;
		this.height=height;
	}
	public static void main(String[] args) {
		DrawIcon icon=new DrawIcon(15,5);
		JLabel j=new JLabel("测试",icon,SwingConstants.CENTER);
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		c.add(j);
		jf.setBackground(Color.WHITE);
		jf.setVisible(true);
		jf.setSize(320, 240);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
}
