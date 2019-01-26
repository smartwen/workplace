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
	//�ڴ�������ӹ������  ������з��ñ��ؼ�
public ClassInfo(){
	frame=new JFrame();
	frame.setTitle("��List���ϴ���ѧ����Ϣ ");
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
		String[] columns={"����","�Ա�","��������"};
		DefaultTableModel model=new DefaultTableModel(columns,0);
		table.setModel(model);//���ñ��ģ��
		List<String> students=getStudents();
		for(String info: students){
			String[] args=info.split(",");//��ѧϰ��Ϣ���Ϊ����
			model.addRow(args);//��ѧ����Ϣ��ӵ�������
		}
		
	}
	return table;
}	
private List<String> getStudents(){
	List<String> list=new ArrayList<String>();
	list.add("���,��,1980-1-1");
	list.add("���2,��,1980-1-12");
	list.add("���3,��,1980-1-13");
	list.add("���4,��,1980-1-14");
	list.add("���5,��,1980-1-15");
	list.add("���6,��,1980-1-16");
	list.add("���7,��,1980-1-17");
	return list;
}
}
