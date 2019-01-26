package com.javaBasicStudy.Eleven;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutDemo extends Frame implements MouseListener{
	public CardLayoutDemo(String str){
		super(str);
		init();
	}
	
private Button first=new Button("��һҳ");
private Button second=new Button("�ڶ�ҳ");
private Button thrid=new Button("����ҳ");
private Panel cards=new Panel();
private CardLayout cl=new CardLayout();

public static void main(String[] args) {
	new CardLayoutDemo("CardLayoutDemo1");
}
	private void init() {
		// TODO �Զ����ɵķ������
		setLayout(new BorderLayout());
		setSize(320,240);
		Panel p =new Panel();
		p.setLayout(new FlowLayout());
		first.addMouseListener(this); //Ϊfirst��ť�����������
		second.addMouseListener(this);
		thrid.addMouseListener(this);
		p.add(first);
		p.add(second);
		p.add(thrid);
		add("North",p);//������������P
		cards.setLayout(cl);
		cards.add("First card",new Button("��һҳ����"));
		cards.add("Second card",new Button("�ڶ�ҳ����"));
		cards.add("Thrid card",new Button("����ҳ����"));
		add("Center",cards);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose(); //�ͷŴ��ڼ������������Ļ��Դ
				System.exit(0); //�˳�����
			}
		});
		//��������  �൱��setSize();
		setVisible(true);
	}
	
	//ʵ�ּ���������
	public void mouseClicked(MouseEvent evt){
		if(evt.getSource() == first){
			cl.first(cards);
		}else if(evt.getSource() == second){
			cl.first(cards);
			cl.next(cards);
		}else if(evt.getSource() == thrid){
			cl.last(cards);
		}
	}
	


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
}
