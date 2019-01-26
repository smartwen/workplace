package com.javaBasicStudy.Eleven;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo {
	public BorderLayoutDemo(){
		b1=new Button("上北");
		b2=new Button("下南");
		b3=new Button("左西");
		b4=new Button("右东");
		b5=new Button("中间");
	}
	public static void main(String[] args) {
		BorderLayoutDemo f1=new BorderLayoutDemo();
		f1.show();
	}
	
	public void show() {
		// TODO 自动生成的方法存根
		 f=new Frame("BorderLayout 边界布局管理器");
		f.setSize(320,240);
		//设置f 的布局管理器为顺序布局管理器
		f.setLayout(new BorderLayout());
	f.add(BorderLayout.NORTH,b1);
		f.add(BorderLayout.SOUTH,b2);
		f.add(BorderLayout.WEST,b3);
		f.add(BorderLayout.EAST,b4);
		f.add(BorderLayout.CENTER,b5);
		//为窗口f添加windowListener监听器
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				f.setVisible(false);
				f.dispose(); //释放窗口及其子组件的屏幕资源
				System.exit(0); //退出程序
			}
		});
		//紧凑排列  相当于setSize();
		f.setVisible(true);
	}
	private Frame f;
	private Button b1,b2,b3,b4,b5;
}
