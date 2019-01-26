package com.javaBasicStudy.Eleven;
/*
1.�Ի�����б���ͱ߽�Ķ��㴰�ڣ��������������� 
��Ϊ��ģʽ����ģʽ 2��
��ģʽ�Ļ���ֹ���������뵽Ӧ�ó����е�����һЩ���㴰����
2.�˵���������ӵ��˵����� �˵�����ӵ������� ��Ϊ�˵���
menu MenuBar   MenuItem
*/
import java.awt.*;
import java.awt.event.*;
public class MenuDemo extends Frame{
	PopupMenu pop; //��������ʼ�������˵�
	public MenuDemo(String string){
		super(string);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);//�˳�����
			}
		});
		setSize(400,300);
		//ѧϰ�˵�
		Menu menu=new Menu("�ļ�");
		menu.add("�½�");
		menu.add("��");//Ϊ�˵��������"��"�˵���
		menu.add("�ر�");
		menu.add("�˳�");
		Menu irons=new Menu("�༭");
		irons.add("��д");
		irons.add("����");
		irons.add("ɾ��");
		irons.add("����");
		irons.add("����");
		irons.addSeparator();//��ӷָ���
		irons.add("ȡ��");
		irons.insert("ճ��",2);
		
		MenuBar mb=new MenuBar();
		mb.add(menu);
		mb.add(irons);
		setMenuBar(mb);//���˵����봰�ڹ���
		pop=new PopupMenu("menu");
		pop.add("�½�");
		pop.add("ճ��");
		pop.add("ȡ��");
		final TextArea p=new TextArea(100,100);
		p.setBackground(Color.BLUE);
		p.add(pop);
		//�¼�����
		p.addMouseListener(new MouseAdapter(){
			public void mouseReleased(java.awt.event.MouseEvent evt){
				if(evt.isPopupTrigger()){
					System.out.println("popup trigger");//����ַ�����Ϣ
					System.out.println(evt.getComponent());//����������
					System.out.println("" +evt.getX()+ ""+evt.getY());
					pop.show(p,evt.getX(),evt.getY());
				}
			}
		});
		this.add(p,BorderLayout.CENTER);//just ������p��ӵ�������
	}
	public static void main(String[] args) {
		new MenuDemo("�˵���ʾ").setVisible(true);
	}
}
