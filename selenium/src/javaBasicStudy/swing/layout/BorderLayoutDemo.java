package com.javaBasicStudy.swing.layout;
import javax.swing.*;

import java.awt.*;
public class BorderLayoutDemo extends JFrame{
	public BorderLayoutDemo(){
		String[] border={BorderLayout.CENTER,BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
	String [] buttonName={"center button","north button","south button","west button","east button"};
	setTitle("边界布局管理器");
	Container c=getContentPane();
	setLayout(new BorderLayout());
	for(int i=0;i<border.length;i++){
		c.add(border[i], new JButton(buttonName[i]));
	}
	setSize(320,240);
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
}
