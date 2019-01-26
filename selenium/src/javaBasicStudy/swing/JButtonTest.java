package com.javaBasicStudy.swing;

import java.net.URL;
import javax.swing.*;
import java.awt.*;
public class JButtonTest extends JFrame{

	public JButtonTest() {
		// TODO 自动生成的构造函数存根
		URL url=JButtonTest.class.getResource("imageButton.jpg");
				Icon icon=new ImageIcon(url);
				setLayout(new GridLayout(3,2,5,5));
				Container c=getContentPane();
				for(int i=1;i<=5;i++){
					JButton j=new JButton("button"+i,icon);
					c.add(j);
					if(i%2==0){
						j.setEnabled(false);
					}
				}
				JButton jb=new JButton();
				jb.setMaximumSize(new Dimension(90,30));
				jb.setIcon(icon);
				jb.setHideActionText(true);
				//设置按钮提示为文字
				jb.setToolTipText("图片按钮");
				//设置按钮边界不显示
				jb.setBorderPainted(false);
				c.add(jb);
				setTitle("创建带文字与图片的按钮");
				setSize(320,240);
				setVisible(true);
				setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				
				
	}
public static void main(String[] args) {
	new JButtonTest();
}
/*
添加其他组件 JRadioButton JCheckBox
*/}
