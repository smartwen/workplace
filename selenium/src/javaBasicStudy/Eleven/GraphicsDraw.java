package com.javaBasicStudy.Eleven;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class GraphicsDraw extends Frame{
	private int cx;
	private int cy;
	public GraphicsDraw(String str) {
		// TODO �Զ����ɵĹ��캯�����
		super(str);
		//���������Ӽ�����
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		GraphicsDraw f=new GraphicsDraw("Graphics��ͼ");
		f.setSize(500,300);
		f.setVisible(true);
	}
	//��дpaint()
	public void paint(Graphics g){
		setXY();
		Point p=new Point(cx/2,cy/2);
		g.drawLine(0,0,cx,cy); //����һ����
		g.draw3DRect(cx/2, cy/2, cx/3,cy/3,false); //����3D��������
		Rectangle rect=new Rectangle((p.x -40),(p.y - 40),80,40);
		int[] xP={(p.x -40),(p.x +90),p.x+200,(p.x -40)};//��ʼ��x��������
		int[] yP={(p.x -40),(p.y +140),(p.y +60),(p.y -40)};
		g.drawArc(rect.x, rect.y, rect.width, rect.height*2,270, 90);//����Բ��
		g.drawPolygon(xP,yP,3);//���ƶ����
		
	}
	private void setXY() {
		// TODO �Զ����ɵķ������
		Dimension d=getSize();//��ȡ���ڵĴ�С
		cx=d.width/2;
		cy=d.height/2;
	}
	
}
