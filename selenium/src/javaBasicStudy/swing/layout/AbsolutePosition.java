package com.javaBasicStudy.swing.layout;
import javax.swing.*;

import java.awt.*;
public class AbsolutePosition extends JFrame{
	public AbsolutePosition(){
		setTitle("ʹ�þ��Բ��ֹ�����");
		//ȡ�����ֹ�����
		setLayout(null);
		setBounds(0,0,200,150);
		Container c=getContentPane();
		JButton b1=new JButton("��ť1");
		JButton b2=new JButton("��ť2");
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
