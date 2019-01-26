package com.javaBasicStudy.swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*//
 * 文本框组件
 * 密码框组件 
 * public JTextField(String text,int fieldwidth)
*/public class JTextFieldTest extends JFrame{
	public JTextFieldTest(){
		final JTextField jt=new JTextField("aaa",20);
		final JButton jb=new JButton("清除");
		final JPasswordField jp=new JPasswordField("123456",20);
	
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jt);
		cp.add(jp);
		cp.add(jb);
		setTitle("清除");
		setSize(250,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.setText("触发事件");
				
			}});
		
		jp.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jp.setText("触发事件");
				
			}});
		
		jb.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jt.setText("");
				jp.setText("");
				jt.requestFocus();//焦点回到文本框
			}
			
		});
	}
	
	public static void main(String[] args) {
		new JTextFieldTest();
	}
}
