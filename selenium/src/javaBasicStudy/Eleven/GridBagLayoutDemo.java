package com.javaBasicStudy.Eleven;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagLayoutDemo extends Frame{
	Label l1,l2,l3,l4;
	TextField tf1,tf2,tf3;
	Button btn1,btn2;
	CheckboxGroup cbg;
	Checkbox cb1,cb2,cb3,cb4;
	GridBagLayout gb;
	GridBagConstraints gbc;
	public GridBagLayoutDemo(String title){
		super(title);
		l1=new Label("�û���");
		l2=new Label("����");
		l3=new Label("�ظ�����");
		l4=new Label("��ȡ;��");
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		gb=new GridBagLayout();
		setLayout(gb);
		gbc=new GridBagConstraints();
		Panel p=new Panel();
		cbg=new CheckboxGroup();
		cb1=new Checkbox("����",cbg,false);
		cb2=new Checkbox("���",cbg,false);
		cb3=new Checkbox("����",cbg,false);
		cb4=new Checkbox("����",cbg,false);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		btn1=new Button("�ύ");
		btn2=new Button("����");
		Panel p1=new Panel();
		p1.add(btn1);
		p1.add(btn2);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose(); //�ͷŴ��ڼ������������Ļ��Դ
				System.exit(0); //�˳�����
			}
		});
		
		gbc.fill=GridBagConstraints.HORIZONTAL;
		addComponent(l1,0,0,1,1);
		addComponent(tf1,0,2,1,4);
		addComponent(l2,1,0,1,1);
		addComponent(tf2,1,2,1,4);
		addComponent(l3,2,0,1,1);
		addComponent(tf3,2,2,1,4);
		addComponent(l4,4,0,1,1);
		addComponent(p,4,2,1,1);
		addComponent(p1,5,2,1,5);
		
	}
	private void addComponent(Component c, int row, int col, int nrow, int ncol) {
		// TODO �Զ����ɵķ������
		gbc.gridx=col;
		gbc.gridy=row;
		gbc.gridheight=ncol;
		gbc.gridwidth=nrow;
		gb.setConstraints(c,gbc);
		add(c);
	}
	
	public static void main(String[] args) {
		GridBagLayoutDemo mygb=new GridBagLayoutDemo("��������ֹ�����");
		mygb.setSize(300,240);
		mygb.setVisible(true);
	}
}
