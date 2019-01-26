package com.javaBasicStudy.swing;
/*
本打算更换文本框JTextField的背景图 但是没有理解如何改变
*/import java.awt.TexturePaint;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class BackgroundJTextField extends JTextField{
	private static final long serialVersionUID=581004473289408630L;
	private TexturePaint paint;
	
	public BackgroundJTextField(File file){
		super();
		try{
			BufferedImage image=ImageIO.read(file);//获得缓冲图片
			Rectangle rectangle=new Rectangle(0,0,image.getWidth(),image.getHeight());
			paint=new TexturePaint(image,rectangle);
			setOpaque(false);//文本域设置为透明的
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	protected void paintComponent(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		g2.setPaint(paint);
		g.fillRect(0, 0, getWidth(), getHeight());//图片充满整个区域
		
		super.paintComponent(g);
	}

}
