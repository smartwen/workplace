/**
 * 
 *//*
package com.javaBasicStudy.IO;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.table.*;

import java.awt.event.*;
import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

*//**
 * @author Administrator
 *��ʾָ�����͵��ļ�
 *�����û��������չ�� �г����ļ����ڵ��ļ��� �ļ���С �޸�ʱ��
 *//*
public class Example1 extends JFrame{
	JLabel jl=new JLabel("�����ļ���չ����");
	JTextField jf=new JTextField(20);
	JButton jb=new JButton("ѡ���ļ���");
	JTable table=new JTable();
	public Example1(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		c.add(jf);
		c.add(jb);
		setTitle("��ʾָ�����͵��ļ�");
		setSize(320,240);
		setVisible(true);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		private void do_button_actionPerformed(ActionEvent e){
			final String fileType=jf.getText();
			if(fileType.isEmpty()){
				JOptionPane.showMessageDialog(this, "�������ļ����ͣ�","",JOptionPane.WARNING_MESSAGE);
				return;//�˳�����
			}
		
		//new �ļ�ѡ����
		JFileChooser chooser=new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setMultiSelectionEnabled(false);
		int result = chooser.showOpenDialog(this);//���ļ�ѡ����
		if(result == JFileChooser.APPROVE_OPTION){
			File[] listFiles=chooser.getSelectedFile().listFiles(new java.io.FileFilter(){

				@Override
				public boolean accept(File pathname) {
					// TODO �Զ����ɵķ������
					if(pathname.getName().endsWith(fileType)){
						return true;
					}else{
						return false;
					}
					
				}
				
			});
		//��÷����������ļ�
			
		//���Ĭ�ϱ��ģ��	
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for(File file : listFiles){
			String name=file.getName();
			long size=file.length();
			String modifyDate=format.format(new Date(file.lastModified()));//����ļ��޸�����
			model.addRow(new String[]{name,""+ size, modifyDate});//��������������
		}
		table.setModel(model);//���±��ģ��
		}
	}
}
	public static void main(String[] args) {
		new Example1();
	}
	
}
*/