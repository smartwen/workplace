package com.javaBasicStudy.Twelve;
import java.awt.*;
import java.awt.event.*;
/*//
 * 为组件添加事件监听器时，经常将事件类以内部类或匿名类的方式使用
*/public class ListenerInnerClass {
	private Frame f;
	private TextField tf;
public static void main(String[] args) {
	ListenerInnerClass li=new ListenerInnerClass();
	li.show();
}
	private void show() {
	// TODO 自动生成的方法存根
		f.add("North",tf);
		f.addMouseMotionListener(new MyMouseMotionListener());
	
		f.setSize(320,240);
		
		//给窗口f添加监听器
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(1);
			}
		});
		f.setSize(320,240);
		f.setVisible(true);
	
}
	public ListenerInnerClass() {
		// TODO 自动生成的构造函数存根
		f=new Frame("监听器内部类，单击或移动鼠标");
		tf=new TextField(20);
	}
//新建成员内部类
	class MyMouseMotionListener extends MouseMotionAdapter{
		public void mouseMoved(MouseEvent e){
			//设置tf的显示文本内容
			tf.setText("鼠标坐标为：x="+e.getX()+"Y="+e.getY());
		}
	}
}
