package com.javaBasicStudy.Eleven;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowLayoutDemo {
	//�������췽��
	public FlowLayoutDemo(){
		 b1=new Button("����");
		 b2=new Button("ȡ��");
		 b3=new Button("ȷ��");
	}
	
	public static void main(String[] args) {
		FlowLayoutDemo f1=new FlowLayoutDemo();
			f1.show();
	}

	public void show() {
		// TODO �Զ����ɵķ������
		 f=new Frame("FlowLayout ˳�򲼾�");
		f.setSize(320,240);
		//����f �Ĳ��ֹ�����Ϊ˳�򲼾ֹ�����
		f.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
		f.add(b1);
		f.add(b2);
		f.add(b3);
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
	private Button b1,b2,b3;
}
