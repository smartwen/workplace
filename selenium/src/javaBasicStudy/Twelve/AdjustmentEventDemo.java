package com.javaBasicStudy.Twelve;
/*
调整事件类adjustment
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
		// TODO 自动生成的方法存根
		setLayout(new GridLayout(1,3));
		slider=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,100);
		//给滚动条添加AdjustmentListener监听器
		slider.addAdjustmentListener(new AdjustmentEventHander());
		//初始化文本域
		value=new TextField("0",5);
		value.setEditable(false);
		//初始化标签对象label
		label=new Label("0813 入秋的深圳");
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
