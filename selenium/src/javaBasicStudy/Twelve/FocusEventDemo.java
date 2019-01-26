package com.javaBasicStudy.Twelve;
//聚焦事件类
import java.awt.*;
import java.awt.event.*;
public class FocusEventDemo extends Frame{
	TextField textfield;
	TextArea textarea;
	public FocusEventDemo(){
		super();
		init();
	}
public static void main(String[] args) {
	new FocusEventDemo();
}
	private void init() {
		// TODO 自动生成的方法存根
		setLayout(new GridLayout(2,1));
		
		textarea=new TextArea();
		textarea.addFocusListener(new FocusListener(){ //FocusListener接口的事件处理器
			public void focusGained(FocusEvent eve){
				textarea.setText("textarea: 获得焦点");
			}
			public void focusLost(FocusEvent eve){
				textarea.setText("textarea: 失去焦点");
			}

		});
		
		textfield=new TextField();
		textfield.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent eve){
				textfield.setText("textfield: 获得焦点");
			}
			public void focusLost(FocusEvent eve){
				textfield.setText("textfield: 失去焦点");
			}
		
		});
		add(textarea);
		add(textfield);
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
}
