package com.javaBasicStudy.Eleven;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liuwen
 * 网格布局管理器 放置顺序 从左到右 从上到下
 * public GridLayout(int row,int column,int horz,int vert)组件分配大小是平均的 average
 *
 */
public class GridLayoutDemo {
	public GridLayoutDemo(){
		b1=new Button("[0][0]");
		b2=new Button("[0][1]");
		b3=new Button("[0][2]");
		b4=new Button("[1][0]");
		b5=new Button("[1][1]");
		b6=new Button("[1][2]");
	}
	public static void main(String[] args) {
		GridLayoutDemo f1=new GridLayoutDemo();
		f1.show();
	}
	
	public void show() {
		// TODO 自动生成的方法存根
		 f=new Frame("GridLayout 边界布局管理器");
		f.setSize(320,240);
		//设置f 的布局管理器为网格布局管理器
		f.setLayout(new GridLayout(2,3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
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
	private Button b1,b2,b3,b4,b5,b6;
}
