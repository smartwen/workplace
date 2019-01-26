/**
 * 
 */
package com.javaBasicStudy.swing;

import java.awt.Container;


/**
 * @author Administrator
 *文本域组件 
 */
import javax.swing.*;
public class JTextAreaTest extends JFrame{
	public JTextAreaTest(){
		Container cp=getContentPane();
		JTextArea jt=new JTextArea("文本域",6,6);
		jt.setLineWrap(true);//文本域可自动换行
		cp.add(jt);
		
		setSize(250,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
