/**
 * 
 */
package com.javaBasicStudy.swing;

import java.awt.Container;


/**
 * @author Administrator
 *�ı������ 
 */
import javax.swing.*;
public class JTextAreaTest extends JFrame{
	public JTextAreaTest(){
		Container cp=getContentPane();
		JTextArea jt=new JTextArea("�ı���",6,6);
		jt.setLineWrap(true);//�ı�����Զ�����
		cp.add(jt);
		
		setSize(250,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
