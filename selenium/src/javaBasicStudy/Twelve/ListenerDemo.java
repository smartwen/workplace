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
		// TODO �Զ����ɵĹ��캯�����
		f=new Frame("���϶����򵥻�");
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
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO �Զ����ɵķ������
		System.exit(1);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO �Զ����ɵķ������
		String s="����϶�";
		tf1.setText(s);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO �Զ����ɵķ������
		String s="����ƶ�";
		tf1.setText(s);
		tf2.setText("�������Ϊ��X="+e.getX()+"Y="+e.getY());
	}


}
