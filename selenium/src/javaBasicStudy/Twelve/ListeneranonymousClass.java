package com.javaBasicStudy.Twelve;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.*;
/*
�����ڲ��ࣺ��������Ա�ڲ����ֻnew һ�����󣬲����µ���̳����¼�
��������ʵ�����¼��������ӿھͿ���ʹ�������ڲ���
*/public class ListeneranonymousClass extends MouseMotionAdapter{
	Frame f;
	TextField tf;
	public static void main(String[] args) {
		ListeneranonymousClass la=new ListeneranonymousClass();
		la.show();
	}
	private void show() {
		// TODO �Զ����ɵķ������
		f.add("North",tf);
		f.setSize(300, 240);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.out.println("�˳�");
				System.exit(0);
			}
		});
		//�ڲ������࿪ʼ ---ʵ�е��¼��������������� 
		//һ���ڲ���ֻ����һ������  ����̳�һ�������ʵ��һ���ӿڵ�ʱ�� 
		//����ʹ�������ڲ���
		f.addMouseMotionListener(new MouseMotionAdapter(){
			public void mouseMoved(MouseEvent e){
				tf.setText("������꣺x="+e.getX()+"y="+e.getY());
			}
		});
		f.setVisible(true);
	}
	public ListeneranonymousClass() {
		// TODO �Զ����ɵĹ��캯�����
		f=new Frame("�������ڲ��࣬���� �ƶ����");
		tf=new TextField(20);
	}

}
