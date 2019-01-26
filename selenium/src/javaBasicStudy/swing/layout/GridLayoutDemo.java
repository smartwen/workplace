package com.javaBasicStudy.swing.layout;
import javax.swing.*;

import java.awt.*;
public class GridLayoutDemo extends JFrame{
	public GridLayoutDemo(){
		setTitle("网格布局管理器");
		Container c=getContentPane();
		setLayout(new GridLayout(7,3,5,5));
		for(int i=0;i<10;i++){
			c.add(new JButton("button"+i));
		}
		setSize(320,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridLayoutDemo();
	}
}
