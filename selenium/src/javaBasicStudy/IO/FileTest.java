/**
 * 
 *//*
package com.javaBasicStudy.IO;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import java.awt.event.*;
*//**
 * @author Administrator
 *�����û��������չ�� �г����ļ����ڵ��ļ��� �ļ���С �޸�ʱ��
 *//*

public class FileTest extends JFrame{
	JLabel jl=new JLabel("�����ļ���չ����");
	JTextField jf=new JTextField(20);
	JButton jb=new JButton("ѡ���ļ���");
	public FileTest(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		c.add(jf);
		c.add(jb);
		setTitle("��ʾָ�����͵��ļ�");
		setSize(320,240);
		setVisible(true);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		protected  void do_button_actionPerformed(ActionEvent e){
			final String fileType=jf.getText();
			if(fileType.isEmpty()){
				JOptionPane.showMessageDialog(this, "�������ļ����ͣ�","",JOptionPane.WARNING_MESSAGE);
				return;//???
			}
		}
		//new �ļ�ѡ����
		JFileChooser chooser=new JFileChooser();
		
		//���Ĭ�ϱ��ģ��
	
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		
		table.setModel();
	}

	public static void main(String[] args) {
		new FileTest();
	}
}
*/