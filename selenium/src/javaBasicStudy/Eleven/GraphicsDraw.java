package com.javaBasicStudy.Eleven;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class GraphicsDraw extends Frame{
	private int cx;
	private int cy;
	public GraphicsDraw(String str) {
		// TODO 自动生成的构造函数存根
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
		GraphicsDraw f=new GraphicsDraw("Graphics绘图");
		f.setSize(500,300);
		f.setVisible(true);
	}
	//重写paint()
	public void paint(Graphics g){
		setXY();
		Point p=new Point(cx/2,cy/2);
		g.drawLine(0,0,cx,cy); //绘制一条线
		g.draw3DRect(cx/2, cy/2, cx/3,cy/3,false); //绘制3D高亮矩形
		Rectangle rect=new Rectangle((p.x -40),(p.y - 40),80,40);
		int[] xP={(p.x -40),(p.x +90),p.x+200,(p.x -40)};//初始化x坐标数组
		int[] yP={(p.x -40),(p.y +140),(p.y +60),(p.y -40)};
		g.drawArc(rect.x, rect.y, rect.width, rect.height*2,270, 90);//绘制圆弧
		g.drawPolygon(xP,yP,3);//绘制多边形
		
	}
	private void setXY() {
		// TODO 自动生成的方法存根
		Dimension d=getSize();//获取窗口的大小
		cx=d.width/2;
		cy=d.height/2;
	}
	
}
