/**
 * 
 */
package com.javaBasicStudy.Twelve;
import java.awt.*;
import java.awt.event.*;

/**
 * @author liuwen
 * 实现KeyListener接口的事件处理器
 *键盘事件类
 */
public class KeyEventDemo extends Frame implements KeyListener{

	/**
	 * 
	 */
	Button button;
	TextArea textarea1,textarea2;
	public KeyEventDemo() {
		// TODO 自动生成的构造函数存根
		super();
		init();
	}

	private void init() {
		// TODO 自动生成的方法存根
		setLayout(new GridLayout(3,1));
		textarea1=new TextArea();
		textarea2=new TextArea();
		add(textarea1);
		button=new Button("请你单击我，然后单机键盘键");
		add(button);
		button.addKeyListener(this);
		add(textarea2);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		setSize(200,300);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new KeyEventDemo();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成的方法存根
		textarea1.setText("按下键盘");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成的方法存根
		textarea1.setText("松开键盘");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成的方法存根
		textarea2.setText(String.valueOf(e.getKeyChar()));
	}

}
