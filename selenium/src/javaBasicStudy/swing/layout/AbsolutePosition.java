package com.javaBasicStudy.swing.layout;
import javax.swing.*;

import java.awt.*;
public class AbsolutePosition extends JFrame{
	public AbsolutePosition(){
		setTitle("使用绝对布局管理器");
		//取消布局管理器
		setLayout(null);
		setBounds(0,0,200,150);
		Container c=getContentPane();
		JButton b1=new JButton("按钮1");
		JButton b2=new JButton("按钮2");
		b1.setBounds(10,30, 80,30);
		b2.setBounds(60, 70, 100, 200);
		c.add(b1);
		c.add(b2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new AbsolutePosition();
	}
}
