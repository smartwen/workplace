package com.javaBasicStudy.Twelve;
/*
ѡ��checkbox combobox list�����ʱ �ͻ������Ŀ�¼�  ʵ��itemListener�ӿ�
���¼�������
*/import java.awt.*;
import java.awt.event.*;
public class ItemEventDemo extends Frame implements ItemListener{
	List list;
	Checkbox checkbox1,checkbox2,checkbox3;
	Choice colorChooser;
	TextArea textarea;
	
	public ItemEventDemo(){
		super();
		init();
	}
public static void main(String[] args) {
	new ItemEventDemo();
}
	private void init() {
		// TODO �Զ����ɵķ������
		setLayout(new GridLayout(4,1));
		textarea=new TextArea();
		add(textarea);
		list=new List(4,false);
		list.add("����");
		list.add("��ѧ");
		list.add("Ӣ��");
		list.add("����");
		list.add("��ѧ");
		list.add("����");
		list.add("����");
		add(list);
		list.addItemListener(this);
		Panel panel=new Panel();
		CheckboxGroup cbg=new CheckboxGroup();
		checkbox1=new Checkbox("one",cbg,true);
		checkbox1.addItemListener(this);
		panel.add(checkbox1);
		checkbox2=new Checkbox("two",cbg,true);
		checkbox2.addItemListener(this);
		panel.add(checkbox2);
		checkbox3=new Checkbox("three",cbg,true);
		checkbox3.addItemListener(this);
		panel.add(checkbox3);
		add(panel);
		
		colorChooser=new Choice();
		colorChooser.add("Green");
		colorChooser.add("Blue");
		colorChooser.add("Red");
		colorChooser.addItemListener(this);
		add(colorChooser);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		setSize(300,200);
		setVisible(true);
			
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO �Զ����ɵķ������
		if(e.getSource()==list)
		{
			textarea.setText(list.getSelectedItem());
		}
		if(e.getSource()==checkbox1)
		{
			textarea.setText(checkbox1.getLabel());
		}
		if(e.getSource()==checkbox2)
		{
			textarea.setText(checkbox2.getLabel());
		}
		if(e.getSource()==checkbox3)
		{
			textarea.setText(checkbox3.getLabel());
		}
		if(e.getSource()==colorChooser)
		{
			textarea.setText(colorChooser.getSelectedItem());
		}

	}
}

