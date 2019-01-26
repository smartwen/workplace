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
	
private Button first=new Button("第一页");
private Button second=new Button("第二页");
private Button thrid=new Button("第三页");
private Panel cards=new Panel();
private CardLayout cl=new CardLayout();

public static void main(String[] args) {
	new CardLayoutDemo("CardLayoutDemo1");
}
	private void init() {
		// TODO 自动生成的方法存根
		setLayout(new BorderLayout());
		setSize(320,240);
		Panel p =new Panel();
		p.setLayout(new FlowLayout());
		first.addMouseListener(this); //为first按钮添加鼠标监听器
		second.addMouseListener(this);
		thrid.addMouseListener(this);
		p.add(first);
		p.add(second);
		p.add(thrid);
		add("North",p);//窗口中添加面板P
		cards.setLayout(cl);
		cards.add("First card",new Button("第一页内容"));
		cards.add("Second card",new Button("第二页内容"));
		cards.add("Thrid card",new Button("第三页内容"));
		add("Center",cards);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose(); //释放窗口及其子组件的屏幕资源
				System.exit(0); //退出程序
			}
		});
		//紧凑排列  相当于setSize();
		setVisible(true);
	}
	
	//实现监听器方法
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
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
}
