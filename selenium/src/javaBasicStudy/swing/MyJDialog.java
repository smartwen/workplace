package com.javaBasicStudy.swing;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyJDialog extends JDialog{
	public MyJDialog(){
		//���ø���JDialog���췽��public JDialog(Frame f,String title,boolean mode)
		super(new MyFrame(),"��һ��JDialog����",true);
		Container container=getContentPane();//������ת��Ϊ����
		container.add(new JLabel("����һ���Ի���"));
		setSize(100,100);
	}
	public static void main(String[] args) {
		new MyJDialog();
	}
}
class MyFrame extends JFrame{
	public MyFrame(){
		Container container=getContentPane();//������ת��Ϊ����
		container.setLayout(null);
		JLabel jl=new JLabel("����һ��JFrame����");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl=new JButton("�����Ի���");
		bl.setBounds(10, 10, 100,21);
		bl.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new MyJDialog().setVisible(true);
			}
		});
		container.add(bl);
	}
}