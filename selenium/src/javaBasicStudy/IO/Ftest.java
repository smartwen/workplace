/**
 * 
 */
package com.javaBasicStudy.IO;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
/**
 * @author Administrator
 *实列 单击“写入文本”按钮实现将文本框中的数据写到磁盘文件中
 *单击“读取文本”按钮 系统将磁盘中文件 的信息显示在文本框中
 */
public class Ftest extends JFrame{
	private static final long serialVersionUID =1L;
	private JPanel jContentPane =null;
	private JTextArea jTextArea=null;
	private JPanel controlPane = null;
	private JButton openButton=null;
	private JButton closeButton= null;
	private JScrollPane scrollPane;
	
	private JTextArea getTextArea(){
		if(jTextArea==null){
			jTextArea=new JTextArea();
		}
		return jTextArea;
	}
	//放置按钮的控制面板 controlPane
	private JPanel getControlPane(){
		if(controlPane==null){
			controlPane=new JPanel();
			FlowLayout flowLayout =new FlowLayout();
			flowLayout.setVgap(1);
			controlPane.setLayout(flowLayout);
			controlPane.add(getOpenButton(), null);
			controlPane.add(getCloseButton(), null);
		}
		return controlPane;
		
	}
	private JButton getOpenButton(){
		if(openButton == null){
			openButton=new JButton();
			openButton.setText("写入文件");
			openButton.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 自动生成的方法存根
					File file=new File("D:/work","test.txt");
					try {
						FileWriter out=new FileWriter(file);
						String s=jTextArea.getText();
						out.write(s);//将信息写入磁盘文件
						out.close();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
				
			});
		}
		return openButton;
		
	}
	
	private JButton getCloseButton(){
		
		if(closeButton == null){
			closeButton=new JButton();
			closeButton.setText("读取文件");
			closeButton.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 自动生成的方法存根
					File file=new File("D:/work","test.txt");
					try {
						FileReader in=new FileReader(file);
					char byt[] = new char[1024];
					int len=in.read(byt);//将字节读入数组
						//设置文本域的显示信息
					jTextArea.setText(new String(byt,0,len));
						in.close();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
				
			});
		}
		return closeButton;
		
	}
	
	public Ftest(){	
		super();
		initialize();
	}

	private void initialize() {
		// TODO 自动生成的方法存根
		this.setTitle("JFrame");
		this.setSize(320, 240);
		this.setContentPane(getJContentPane());
	}
	
	private JPanel getJContentPane(){
		if(jContentPane == null){
			jContentPane=new JPanel();	
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getScrollPane(), BorderLayout.CENTER);
			jContentPane.add(getControlPane(), BorderLayout.SOUTH);
		}
		return jContentPane;
		
	}
	private JScrollPane getScrollPane() {
		// TODO 自动生成的方法存根
		if(scrollPane ==null){
			scrollPane =new JScrollPane();
			//JScrollPane scrollPane=new JScrollPane(getTextArea());
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	public static void main(String[] args) {
		Ftest ft=new Ftest();
		ft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ft.setVisible(true);
	}
}
