package com.javaBasicStudy.Eleven;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstFrame extends Frame{
	public FirstFrame(String string){
		super(string);
	}
	public static void main(String[] args) {
		FirstFrame f=new FirstFrame("���ǵ�һ��Frame");
		f.setSize(300,200);
		f.setBackground(Color.BLUE);
		f.setVisible(true);  //����frame�ɼ�  ȱʡ���ɼ�
		
		f.addWindowListener(f.new MyWindowadapter());
	}
	//ʵ�ִ��ڵĹرչ���
	class MyWindowadapter extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0); //��������˳�
		}
	}
}
