package com.javaBasicStudy.Eleven;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarDemo extends Frame{
	public ScrollbarDemo(){
		super();
		init();
	}
	public static void main(String[] args) {
		new ScrollbarDemo();
	}
	Scrollbar slider;
	Label label;
	public void init(){
		setLayout(new GridLayout(1,3));
		//初始化滚动条对象
		slider=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
		//初始化标签对象
		label=new Label("0-100");
		label.setBackground(Color.cyan);
		add(label);
		add(slider);
		//监听事件
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent evt){
			setVisible(false);
			dispose();
			System.exit(0);
		}
	});
	setSize(300,50);
	setVisible(true);
	}
}
