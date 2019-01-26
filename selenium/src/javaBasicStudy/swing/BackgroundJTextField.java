package com.javaBasicStudy.swing;
/*
����������ı���JTextField�ı���ͼ ����û�������θı�
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
			BufferedImage image=ImageIO.read(file);//��û���ͼƬ
			Rectangle rectangle=new Rectangle(0,0,image.getWidth(),image.getHeight());
			paint=new TexturePaint(image,rectangle);
			setOpaque(false);//�ı�������Ϊ͸����
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	protected void paintComponent(Graphics g){
		Graphics2D g2=(Graphics2D)g;
		g2.setPaint(paint);
		g.fillRect(0, 0, getWidth(), getHeight());//ͼƬ������������
		
		super.paintComponent(g);
	}

}
