package com.javaBasicStudy.Eleven;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowLayoutDemo {
	//创建构造方法
	public FlowLayoutDemo(){
		 b1=new Button("继续");
		 b2=new Button("取消");
		 b3=new Button("确认");
	}
	
	public static void main(String[] args) {
		FlowLayoutDemo f1=new FlowLayoutDemo();
			f1.show();
	}

	public void show() {
		// TODO 自动生成的方法存根
		 f=new Frame("FlowLayout 顺序布局");
		f.setSize(320,240);
		//设置f 的布局管理器为顺序布局管理器
		f.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
		f.add(b1);
		f.add(b2);
		f.add(b3);
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
	private Button b1,b2,b3;
}
