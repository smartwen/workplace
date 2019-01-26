package com.javaBasicStudy.swing;
/*
下拉列表框的使用daemo ComboBoxModel为接口
*/import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.ListDataListener;
public class JComboboxModelTest extends JFrame{
JComboBox jc=new JComboBox(new MyJComboBox());
JLabel jl=new JLabel("请选择下拉框");
	public JComboboxModelTest() {
		// TODO 自动生成的构造函数存根
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(jl);	
		c.add(jc);
	
		
		setSize(320,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	//main
	public static void main(String[] args) {
		new JComboboxModelTest();
	}
}

class MyJComboBox extends AbstractListModel implements ComboBoxModel{
String[] test={"身份证","军人证","护照","护士证"};
String selecteditem=null;
	@Override
	public int getSize() {
		// TODO 返回下拉列表中的条目
		return test.length;
	}

	@Override
	public Object getElementAt(int index) {
		// TODO 自动生成的方法存根
		return test[index];
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO 设置下拉列表框项目
		selecteditem=(String) anItem;
	}

	@Override
	public Object getSelectedItem() {
		// TODO 获取下拉列表框项目
		return selecteditem;
	}
	
	
}