package com.javaBasicStudy.Twelve;
import java.awt.*;
import java.awt.event.*;
public class MouseEventDemo extends Frame{
Panel panel;
TextField textfield1,textfield2;

	public MouseEventDemo() {
		// TODO �Զ����ɵĹ��캯�����
		super();
		init();
	}

	private void init() {
		// TODO �Զ����ɵķ������
		setLayout(new GridLayout(3,1));
		textfield1=new TextField(20);
		textfield2=new TextField();
		add(textfield1);
		add(textfield2);
		//��ʼ�����
		panel=new Panel();
		add(panel);
		panel.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent e){
				textfield2.setText("X="+e.getX()+";Y="+e.getY());
			}
			public void mouseEntered(MouseEvent e){
				textfield1.setText("�������������");
			}
			public void mouseExited(MouseEvent e){
				textfield1.setText("����뿪�������");
			}
			public void mousePressed(MouseEvent e){
				textfield1.setText("��걻����");
			}
			public void mouseReleased(MouseEvent e){
				textfield1.setText("����ɿ�");
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
