package com.javaBasicStudy.Twelve;

//�����¼���   ʵ��windowListener�ӿ�
import java.awt.*;
import java.awt.event.*;
public class WindowEventDemo extends Frame{
String str=null;
	public WindowEventDemo() {
		// TODO �Զ����ɵĹ��캯�����
		super();
		init();
	}
public static void main(String[] args) {
	new WindowEventDemo();
}
	private void init() {
		// TODO �Զ����ɵķ������
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
				// TODO �Զ����ɵķ������
				str="windowOpened";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO �Զ����ɵķ������
				str="windowClosed";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO �Զ����ɵķ������
				str="windowIconified";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO �Զ����ɵķ������
				str="windowDeiconfied";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO �Զ����ɵķ������
				str="windowActivated";
				System.out.println(str);
				repaint();
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO �Զ����ɵķ������
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
