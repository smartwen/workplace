/**
 * 
 */
package com.javaBasicStudy.Twelve;
import java.awt.*;
import java.awt.event.*;

/**
 * @author liuwen
 * ʵ��KeyListener�ӿڵ��¼�������
 *�����¼���
 */
public class KeyEventDemo extends Frame implements KeyListener{

	/**
	 * 
	 */
	Button button;
	TextArea textarea1,textarea2;
	public KeyEventDemo() {
		// TODO �Զ����ɵĹ��캯�����
		super();
		init();
	}

	private void init() {
		// TODO �Զ����ɵķ������
		setLayout(new GridLayout(3,1));
		textarea1=new TextArea();
		textarea2=new TextArea();
		add(textarea1);
		button=new Button("���㵥���ң�Ȼ�󵥻����̼�");
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
		// TODO �Զ����ɵķ������
		new KeyEventDemo();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO �Զ����ɵķ������
		textarea1.setText("���¼���");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO �Զ����ɵķ������
		textarea1.setText("�ɿ�����");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO �Զ����ɵķ������
		textarea2.setText(String.valueOf(e.getKeyChar()));
	}

}
