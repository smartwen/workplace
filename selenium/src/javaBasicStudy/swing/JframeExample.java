/**
 * 
 */
package com.javaBasicStudy.swing;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
/**
 * @author Administrator
 * one example for Jfarme
 *Swing�����ĳ�����Ժܺõ���ֲ������ƽ̨ϵͳ���أ����������ǲ�����Ӱ���Ŷ
 */


public class JframeExample {
	JFrame jf;
	public void CreatJFrame(String title){
		jf=new JFrame(title);
		Container container=jf.getContentPane();//������ת��Ϊ����
		JLabel jl=new JLabel("����һ��JFrame����");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(320,240);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JframeExample().CreatJFrame("newһ��JFrame����");
	}
}
