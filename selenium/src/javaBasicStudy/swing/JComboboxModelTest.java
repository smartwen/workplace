package com.javaBasicStudy.swing;
/*
�����б���ʹ��daemo ComboBoxModelΪ�ӿ�
*/import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.ListDataListener;
public class JComboboxModelTest extends JFrame{
JComboBox jc=new JComboBox(new MyJComboBox());
JLabel jl=new JLabel("��ѡ��������");
	public JComboboxModelTest() {
		// TODO �Զ����ɵĹ��캯�����
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
String[] test={"���֤","����֤","����","��ʿ֤"};
String selecteditem=null;
	@Override
	public int getSize() {
		// TODO ���������б��е���Ŀ
		return test.length;
	}

	@Override
	public Object getElementAt(int index) {
		// TODO �Զ����ɵķ������
		return test[index];
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void setSelectedItem(Object anItem) {
		// TODO ���������б����Ŀ
		selecteditem=(String) anItem;
	}

	@Override
	public Object getSelectedItem() {
		// TODO ��ȡ�����б����Ŀ
		return selecteditem;
	}
	
	
}