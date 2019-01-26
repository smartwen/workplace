package com.javaBasicStudy.Twelve;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.*;
/*
匿名内部类：当声明成员内部类后，只new 一个对象，并且新的类继承了事件
适配器或实现了事件监听器接口就可以使用匿名内部类
*/public class ListeneranonymousClass extends MouseMotionAdapter{
	Frame f;
	TextField tf;
	public static void main(String[] args) {
		ListeneranonymousClass la=new ListeneranonymousClass();
		la.show();
	}
	private void show() {
		// TODO 自动生成的方法存根
		f.add("North",tf);
		f.setSize(300, 240);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.out.println("退出");
				System.exit(0);
			}
		});
		//内部匿名类开始 ---实列的事件处理类是匿名类 
		//一个内部类只创建一个对象  该类继承一个父类或实现一个接口的时候 
		//方可使用匿名内部类
		f.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				tf.setText("鼠标坐标：x="+e.getX()+"y="+e.getY());
			}
		});
		f.setVisible(true);
	}
	public ListeneranonymousClass() {
		// TODO 自动生成的构造函数存根
		f=new Frame("监听器内部类，单击 移动鼠标");
		tf=new TextField(20);
	}

}
