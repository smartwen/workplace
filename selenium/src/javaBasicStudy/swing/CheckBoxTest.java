package com.javaBasicStudy.swing;
import java.awt.Container;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CheckBoxTest extends JFrame{
StringBuilder buff=null;
	public CheckBoxTest() {
		setTitle("��ѡ���ʹ��");
		// TODO �Զ����ɵĹ��캯�����
		JPanel panel1=new JPanel();
		JPanel panel2=new JPanel();
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		c.add(panel1,BorderLayout.NORTH);
		
		JTextArea jt=new JTextArea(20,50);
		final JScrollPane scrollPane=new JScrollPane(jt);
		c.add(scrollPane);
		
		c.add(panel2, BorderLayout.SOUTH);
		JCheckBox jc1=new JCheckBox("��ѡ��1");
		JCheckBox jc2=new JCheckBox();
		JCheckBox jc3=new JCheckBox();
		panel2.add(jc1);
		panel2.add(jc2);
		panel2.add(jc3);
	
		jc1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jt.append(jc1.getText()+"\n");
			}
		});
		jc1.removeActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				jt.append("��ѡ��1��ȡ��\n");
			}
			
		});
		
		jc2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jt.append("��ѡ��2��ѡ��\n");
			}
		});
		
		jc3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jt.append("��ѡ��3��ѡ��\n");
			}
		});

		setSize(320,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new CheckBoxTest();
	}
}
