package com.javaBasicStudy.Twelve;

//窗口事件类   实现windowListener接口
import java.awt.*;
import java.awt.event.*;
public class WindowEventDemo extends Frame{
String str=null;
	public WindowEventDemo() {
		// TODO 自动生成的构造函数存根
		super();
		init();
	}
public static void main(String[] args) {
	new WindowEventDemo();
}
	private void init() {
		// TODO 自动生成的方法存根
		addWindowListener(new WindowListener(){
			public void windowClosing(WindowEvent e){
				str = "windowClosing";
				System.out.println(str);
				setVisible(false);
				dispose();
				System.exit(0);
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO 自动生成的方法存根
				str="windowOpened";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO 自动生成的方法存根
				str="windowClosed";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO 自动生成的方法存根
				str="windowIconified";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO 自动生成的方法存根
				str="windowDeiconfied";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO 自动生成的方法存根
				str="windowActivated";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO 自动生成的方法存根
				str="windowDeactivated";
				System.out.println(str);
				repaint();
			}
			
		});
		setSize(200,200);
		setVisible(true);
	}
public void paint(Graphics g){
		g.drawString(str,30,100);
	}

}
