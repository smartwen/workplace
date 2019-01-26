
package com.javaBasicStudy.swing.layout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class FlowLayoutDemo extends JFrame{
	public FlowLayoutDemo(){
		setTitle("使用流布局管理器");
		Container c=getContentPane();
		setLayout(new FlowLayout(2,10,10));
		for(int i=0;i<10;i++){
			c.add(new JButton("button"+i));
			setSize(320,240);
			setVisible(true);
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		
	}
	public static void main(String[] args) {
		new FlowLayoutDemo();
	}
}
