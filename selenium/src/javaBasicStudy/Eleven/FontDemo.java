package com.javaBasicStudy.Eleven;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FontDemo extends Frame{
	public FontDemo(String str){
		super(str);
		//给窗口增加监听器
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		FontDemo f=new FontDemo("字体大小");
		f.setBackground(Color.black);
		f.setSize(400,300);
		f.setVisible(true);
	}
	//重写paint()
	public void paint(Graphics g){
		Font font=new Font("Arial",Font.BOLD,18);
		g.setColor(Color.RED);
		g.setFont(font);
		g.drawString("Font:"+font.getName()+font.getSize(),30,50);
		g.setFont(new Font("宋体",Font.BOLD,36));
		g.drawString("小萌不听话",20,120);
		g.setColor(new Color(0,0,0));
	}
}
