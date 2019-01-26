package com.javaBasicStudy.Eleven;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo {
	public BorderLayoutDemo(){
		b1=new Button("�ϱ�");
		b2=new Button("����");
		b3=new Button("����");
		b4=new Button("�Ҷ�");
		b5=new Button("�м�");
	}
	public static void main(String[] args) {
		BorderLayoutDemo f1=new BorderLayoutDemo();
		f1.show();
	}
	
	public void show() {
		// TODO �Զ����ɵķ������
		 f=new Frame("BorderLayout �߽粼�ֹ�����");
		f.setSize(320,240);
		//����f �Ĳ��ֹ�����Ϊ˳�򲼾ֹ�����
		f.setLayout(new BorderLayout());
	f.add(BorderLayout.NORTH,b1);
		f.add(BorderLayout.SOUTH,b2);
		f.add(BorderLayout.WEST,b3);
		f.add(BorderLayout.EAST,b4);
		f.add(BorderLayout.CENTER,b5);
		//Ϊ����f���windowListener������
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				f.setVisible(false);
				f.dispose(); //�ͷŴ��ڼ������������Ļ��Դ
				System.exit(0); //�˳�����
			}
		});
		//��������  �൱��setSize();
		f.setVisible(true);
	}
	private Frame f;
	private Button b1,b2,b3,b4,b5;
}
