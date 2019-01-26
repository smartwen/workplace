package com.javaBasicStudy.collection;
import java.awt.BorderLayout;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
public class ClassInfo {
	JTable table;
	JPanel contentPane;
	JFrame frame;
	public static void main(String[] args) {
		new ClassInfo();
	}
	//在窗体中添加滚动面板  在面板中放置表格控件
public ClassInfo(){
	frame=new JFrame();
	frame.setTitle("用List集合传递学生信息 ");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBounds(100,100,392,223);
	contentPane=new JPanel();
	contentPane.setBorder(new EmptyBorder(5,5,5,5));
	contentPane.setLayout(new BorderLayout(0,0));
	frame.setContentPane(contentPane);
	JScrollPane scrollPane=new JScrollPane();
	contentPane.add(scrollPane,BorderLayout.CENTER);
	scrollPane.setViewportView(getTable());
}

private JTable getTable(){
	if(table==null){
		table=new JTable();
		table.setRowHeight(23);
		String[] columns={"姓名","性别","出生日期"};
		DefaultTableModel model=new DefaultTableModel(columns,0);
		table.setModel(model);//设置表格模型
		List<String> students=getStudents();
		for(String info: students){
			String[] args=info.split(",");//把学习信息拆分为数组
			model.addRow(args);//把学生信息添加到表格的行
		}
		
	}
	return table;
}	
private List<String> getStudents(){
	List<String> list=new ArrayList<String>();
	list.add("李哥,男,1980-1-1");
	list.add("李哥2,男,1980-1-12");
	list.add("李哥3,男,1980-1-13");
	list.add("李哥4,男,1980-1-14");
	list.add("李哥5,男,1980-1-15");
	list.add("李哥6,男,1980-1-16");
	list.add("李哥7,男,1980-1-17");
	return list;
}
}
