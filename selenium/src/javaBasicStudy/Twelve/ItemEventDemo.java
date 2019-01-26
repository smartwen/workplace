package com.javaBasicStudy.Twelve;
/*
选择checkbox combobox list等组件时 就会产生项目事件  实现itemListener接口
的事件处理器
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
		// TODO 自动生成的方法存根
		setLayout(new GridLayout(4,1));
		textarea=new TextArea();
		add(textarea);
		list=new List(4,false);
		list.add("语文");
		list.add("数学");
		list.add("英文");
		list.add("物理");
		list.add("化学");
		list.add("生物");
		list.add("地理");
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
		// TODO 自动生成的方法存根
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

