package com.javaBasicStudy.Twelve;
import java.awt.*;
import java.awt.event.*;
public class MouseEventDemo extends Frame{
Panel panel;
TextField textfield1,textfield2;

	public MouseEventDemo() {
		// TODO 自动生成的构造函数存根
		super();
		init();
	}

	private void init() {
		// TODO 自动生成的方法存根
		setLayout(new GridLayout(3,1));
		textfield1=new TextField(20);
		textfield2=new TextField();
		add(textfield1);
		add(textfield2);
		//初始化面板
		panel=new Panel();
		add(panel);
		panel.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent e){
				textfield2.setText("X="+e.getX()+";Y="+e.getY());
			}
			public void mouseEntered(MouseEvent e){
				textfield1.setText("鼠标进入面板区域");
			}
			public void mouseExited(MouseEvent e){
				textfield1.setText("鼠标离开面板区域");
			}
			public void mousePressed(MouseEvent e){
				textfield1.setText("鼠标被按下");
			}
			public void mouseReleased(MouseEvent e){
				textfield1.setText("鼠标松开");
			}
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		setSize(200,300);
		setVisible(true);
	}
public static void main(String[] args) {
	new MouseEventDemo();
	}
}
