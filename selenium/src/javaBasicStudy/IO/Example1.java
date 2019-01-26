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
 *显示指定类型的文件
 *依据用户输入的扩展名 列出该文件夹内的文件名 文件大小 修改时间
 *//*
public class Example1 extends JFrame{
	JLabel jl=new JLabel("输入文件扩展名：");
	JTextField jf=new JTextField(20);
	JButton jb=new JButton("选择文件夹");
	JTable table=new JTable();
	public Example1(){
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);
		c.add(jf);
		c.add(jb);
		setTitle("显示指定类型的文件");
		setSize(320,240);
		setVisible(true);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		private void do_button_actionPerformed(ActionEvent e){
			final String fileType=jf.getText();
			if(fileType.isEmpty()){
				JOptionPane.showMessageDialog(this, "请输入文件类型！","",JOptionPane.WARNING_MESSAGE);
				return;//退出程序
			}
		
		//new 文件选择器
		JFileChooser chooser=new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setMultiSelectionEnabled(false);
		int result = chooser.showOpenDialog(this);//打开文件选择器
		if(result == JFileChooser.APPROVE_OPTION){
			File[] listFiles=chooser.getSelectedFile().listFiles(new java.io.FileFilter(){

				@Override
				public boolean accept(File pathname) {
					// TODO 自动生成的方法存根
					if(pathname.getName().endsWith(fileType)){
						return true;
					}else{
						return false;
					}
					
				}
				
			});
		//获得符合条件的文件
			
		//获得默认表格模型	
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for(File file : listFiles){
			String name=file.getName();
			long size=file.length();
			String modifyDate=format.format(new Date(file.lastModified()));//获得文件修改日期
			model.addRow(new String[]{name,""+ size, modifyDate});//向表格中增加数据
		}
		table.setModel(model);//更新表格模型
		}
	}
}
	public static void main(String[] args) {
		new Example1();
	}
	
}
*/