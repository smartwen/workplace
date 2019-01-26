package com.javaBasicStudy.Twelve;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
JAVAʵ�ּ������ӿڵķ��������¼�
�ڶ���ʵ�ּ������ӿڵ��ֶ��� ʹ���¼������� eventAdapter
compoemtAdapter
containerAdapter
focusAdapter
keyAdapter
mouseAdapter
mouseMotionAdapter 
//f.addMouseMotionAdapter(new MouseMotionAdapter())
windowAdapter
*/public class AdapterDemo2 {
	Frame f;
	Panel panel;
	Point start,end;
	public static void main(String[] args) {
		new AdapterDemo2();
	}

	public AdapterDemo2() {
		// TODO �Զ����ɵĹ��캯�����
		f=new Frame("�뵥�������϶����");
		panel=new Panel();
		f.add("Center",panel);
		panel.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				start=e.getPoint();
				System.out.println(start);
			}
			public void mouseReleased(MouseEvent e){
				end=e.getPoint();//��ȡ����¼�����
				System.out.println(end);
				Graphics g=panel.getGraphics();//��ȡ���ͼ��������
				panel.paint(g);//���ͼ�λ���
				g.drawLine(start.x, start.y,end.x, end.y);//�����panel�滭��
			}
		});
		//Ϊ����f���Ӵ��ڼ�����
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(1);
			}	
		});
		f.setSize(320, 240);
		f.setVisible(true);
	}

}
