package com.javaBasicStudy.swing;

import java.awt.Container;

import javax.swing.*;
public class JScrollPaneTest extends JFrame{

	public JScrollPaneTest() {
		// TODO 自动生成的构造函数存根
		setTitle("带滚动条的文字编译器");
		Container c=getContentPane();
		JTextArea ta=new JTextArea(50,20);
		ta.setText("带滚动条的文字编译器");
		JScrollPane sp=new JScrollPane(ta);
		c.add(sp);
		
		setSize(320,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JScrollPaneTest();
	}

}
