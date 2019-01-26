package com.javaBasicStudy.Twelve;
import java.awt.*;
import java.awt.event.*;
public class ListenerDemo implements MouseMotionListener,MouseListener,WindowListener{
	private Frame f;
	private TextField tf1,tf2;
	public static void main(String[] args) {
		new ListenerDemo();
	}
	public ListenerDemo() {
		// TODO 自动生成的构造函数存根
		f=new Frame("请拖动鼠标或单击");
		tf1=new TextField(20);
		tf2=new TextField(20);
		f.add("SOUTH",tf1);
		f.add("NORTH",tf2);
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		f.addWindowListener(this);
		f.setSize(320,240);
		f.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自动生成的方法存根
		System.exit(1);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自动生成的方法存根
		String s="鼠标拖动";
		tf1.setText(s);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自动生成的方法存根
		String s="鼠标移动";
		tf1.setText(s);
		tf2.setText("鼠标坐标为：X="+e.getX()+"Y="+e.getY());
	}


}
