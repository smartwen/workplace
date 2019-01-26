package com.javaBasicStudy.Twelve;
//�۽��¼���
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
		// TODO �Զ����ɵķ������
		setLayout(new GridLayout(2,1));
		
		textarea=new TextArea();
		textarea.addFocusListener(new FocusListener(){ //FocusListener�ӿڵ��¼�������
			public void focusGained(FocusEvent eve){
				textarea.setText("textarea: ��ý���");
			}
			public void focusLost(FocusEvent eve){
				textarea.setText("textarea: ʧȥ����");
			}

		});
		
		textfield=new TextField();
		textfield.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent eve){
				textfield.setText("textfield: ��ý���");
			}
			public void focusLost(FocusEvent eve){
				textfield.setText("textfield: ʧȥ����");
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
