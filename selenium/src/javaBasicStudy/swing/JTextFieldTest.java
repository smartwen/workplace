package com.javaBasicStudy.swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*//
 * �ı������
 * �������� 
 * public JTextField(String text,int fieldwidth)
*/public class JTextFieldTest extends JFrame{
	public JTextFieldTest(){
		final JTextField jt=new JTextField("aaa",20);
		final JButton jb=new JButton("���");
		final JPasswordField jp=new JPasswordField("123456",20);
	
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jt);
		cp.add(jp);
		cp.add(jb);
		setTitle("���");
		setSize(250,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jt.setText("�����¼�");
				
			}});
		
		jp.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jp.setText("�����¼�");
				
			}});
		
		jb.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jt.setText("");
				jp.setText("");
				jt.requestFocus();//����ص��ı���
			}
			
		});
	}
	
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}
