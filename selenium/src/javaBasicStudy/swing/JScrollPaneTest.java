package com.javaBasicStudy.swing;

import java.awt.Container;

import javax.swing.*;
public class JScrollPaneTest extends JFrame{

	public JScrollPaneTest() {
		// TODO �Զ����ɵĹ��캯�����
		setTitle("�������������ֱ�����");
		Container c=getContentPane();
		JTextArea ta=new JTextArea(50,20);
		ta.setText("�������������ֱ�����");
		JScrollPane sp=new JScrollPane(ta);
		c.add(sp);
		
		setSize(320,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new JScrollPaneTest();
	}

}
