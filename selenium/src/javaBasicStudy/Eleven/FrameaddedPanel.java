package com.javaBasicStudy.Eleven;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameaddedPanel extends Frame{
	//���ø���Ĺ��췽��
	public FrameaddedPanel(String str)
	{
		super(str);
	}
	
	public static void main(String[] args) {
		FrameaddedPanel f=new FrameaddedPanel("��frame�����panel");
		Panel p=new Panel();
		f.setSize(320, 240);
		f.setBackground(Color.BLUE);
		//f.setVisible(true);
		f.setLayout(null);//ȡ�����ֹ�����
		p.setSize(160,120);
		p.setBackground(Color.red);
		f.add(p);
		f.setVisible(true);
		
		f.addWindowListener(f.new MyWindowadapter());
	}
	//ʵ�ִ��ڵĹرչ���
	class MyWindowadapter extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0); //��������˳�
		}
	}
}

