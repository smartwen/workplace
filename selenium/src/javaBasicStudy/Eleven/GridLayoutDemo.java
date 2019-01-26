package com.javaBasicStudy.Eleven;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liuwen
 * ���񲼾ֹ����� ����˳�� ������ ���ϵ���
 * public GridLayout(int row,int column,int horz,int vert)��������С��ƽ���� average
 *
 */
public class GridLayoutDemo {
	public GridLayoutDemo(){
		b1=new Button("[0][0]");
		b2=new Button("[0][1]");
		b3=new Button("[0][2]");
		b4=new Button("[1][0]");
		b5=new Button("[1][1]");
		b6=new Button("[1][2]");
	}
	public static void main(String[] args) {
		GridLayoutDemo f1=new GridLayoutDemo();
		f1.show();
	}
	
	public void show() {
		// TODO �Զ����ɵķ������
		 f=new Frame("GridLayout �߽粼�ֹ�����");
		f.setSize(320,240);
		//����f �Ĳ��ֹ�����Ϊ���񲼾ֹ�����
		f.setLayout(new GridLayout(2,3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
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
	private Button b1,b2,b3,b4,b5,b6;
}
