package com.javaBasicStudy.Twelve;
/*
�����¼���adjustment
*/import java.awt.*;
import java.awt.event.*;
public class AdjustmentEventDemo extends Frame{
	Scrollbar slider;
	TextField value;
	Label label;
	public AdjustmentEventDemo(){
		super();
		init();
	}

	private void init() {
		// TODO �Զ����ɵķ������
		setLayout(new GridLayout(1,3));
		slider=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
		//�����������AdjustmentListener������
		slider.addAdjustmentListener(new AdjustmentEventHander());
		//��ʼ���ı���
		value=new TextField("0",5);
		value.setEditable(false);
		//��ʼ����ǩ����label
		label=new Label("0813 ���������");
		label.setBackground(Color.cyan);
		add(label);
		add(slider);
		add(value);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		setSize(300,50);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AdjustmentEventDemo();
	}
	
	class AdjustmentEventHander implements AdjustmentListener
	{
		public void adjustmentValueChanged(AdjustmentEvent eve){
			value.setText(Integer.toString(((Scrollbar) eve.getSource()).getValue()));
		}
	}
}
