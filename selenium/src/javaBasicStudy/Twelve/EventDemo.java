package com.javaBasicStudy.Twelve;
import java.awt.*;
import java.awt.event.*;
public class EventDemo {
	public static void main(String[] args) {
		final Frame f=new Frame("Test");
		Button b=new Button("Press me");
		//注册监听器进行授权
		b.addActionListener(new ButtonHandler());
		f.setLayout(new FlowLayout());
		f.add(b);
		f.setSize(200,100);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				f.setVisible(false);
				f.dispose();
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("时间发生 已经捕获到");
	}
}