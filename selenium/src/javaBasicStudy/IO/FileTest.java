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
 *依据用户输入的扩展名 列出该文件夹内的文件名 文件大小 修改时间
 *//*

public class FileTest extends JFrame{
	JLabel jl=new JLabel("输入文件扩展名：");
	JTextField jf=new JTextField(20);
	JButton jb=new JButton("选择文件夹");
	public FileTest(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		c.add(jf);
		c.add(jb);
		setTitle("显示指定类型的文件");
		setSize(320,240);
		setVisible(true);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		protected  void do_button_actionPerformed(ActionEvent e){
			final String fileType=jf.getText();
			if(fileType.isEmpty()){
				JOptionPane.showMessageDialog(this, "请输入文件类型！","",JOptionPane.WARNING_MESSAGE);
				return;//???
			}
		}
		//new 文件选择器
		JFileChooser chooser=new JFileChooser();
		
		//获得默认表格模型
	
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		
		table.setModel();
	}

	public static void main(String[] args) {
		new FileTest();
	}
}
*/