package com.javaBasicStudy.Eleven;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameaddedPanel extends Frame{
	//调用父类的构造方法
	public FrameaddedPanel(String str)
	{
		super(str);
	}
	
	public static void main(String[] args) {
		FrameaddedPanel f=new FrameaddedPanel("在frame中添加panel");
		Panel p=new Panel();
		f.setSize(320, 240);
		f.setBackground(Color.BLUE);
		//f.setVisible(true);
		f.setLayout(null);//取消布局管理器
		p.setSize(160,120);
		p.setBackground(Color.red);
		f.add(p);
		f.setVisible(true);
		
		f.addWindowListener(f.new MyWindowadapter());
	}
	//实现窗口的关闭功能
	class MyWindowadapter extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0); //程序进行退出
		}
	}
}

