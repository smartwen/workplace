package com.javaBasicStudy.Twelve;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
JAVA实现监听器接口的方法处理事件
第二种实现监听器接口的手段是 使用事件适配器 eventAdapter
compoemtAdapter
containerAdapter
focusAdapter
keyAdapter
mouseAdapter
mouseMotionAdapter 
//f.addMouseMotionAdapter(new MouseMotionAdapter())
windowAdapter
*/public class AdapterDemo2 {
	Frame f;
	Panel panel;
	Point start,end;
	public static void main(String[] args) {
		new AdapterDemo2();
	}

	public AdapterDemo2() {
		// TODO 自动生成的构造函数存根
		f=new Frame("请单击，或拖动鼠标");
		panel=new Panel();
		f.add("Center",panel);
		panel.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				start=e.getPoint();
				System.out.println(start);
			}
			public void mouseReleased(MouseEvent e){
				end=e.getPoint();//获取鼠标事件坐标
				System.out.println(end);
				Graphics g=panel.getGraphics();//获取面板图形上下文
				panel.paint(g);//面板图形绘制
				g.drawLine(start.x, start.y,end.x, end.y);//在面板panel绘画线
			}
		});
		//为窗口f增加窗口监听器
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(1);
			}	
		});
		f.setSize(320, 240);
		f.setVisible(true);
	}

}
