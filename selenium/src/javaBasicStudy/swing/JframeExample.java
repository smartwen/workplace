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
 *Swing开发的程序可以很好的移植到其他平台系统上呢，其界面外光是不会受影响的哦
 */


public class JframeExample {
	JFrame jf;
	public void CreatJFrame(String title){
		jf=new JFrame(title);
		Container container=jf.getContentPane();//将窗体转换为容器
		JLabel jl=new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(320,240);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JframeExample().CreatJFrame("new一个JFrame窗体");
	}
}
