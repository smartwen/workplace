package com.javaBasicStudy.Eleven;
/*
1.对话框带有标题和边界的顶层窗口，依赖于其他窗口 
分为有模式和无模式 2种
有模式的会阻止将内容输入到应用程序中的其他一些顶层窗口中
2.菜单必须先添加到菜单栏中 菜单栏添加到窗口中 视为菜单树
menu MenuBar   MenuItem
*/
import java.awt.*;
import java.awt.event.*;
public class MenuDemo extends Frame{
	PopupMenu pop; //声明并初始化弹出菜单
	public MenuDemo(String string){
		super(string);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				setVisible(false);
				dispose();
				System.exit(0);//退出程序
			}
		});
		setSize(400,300);
		//学习菜单
		Menu menu=new Menu("文件");
		menu.add("新建");
		menu.add("打开");//为菜单对象添加"打开"菜单项
		menu.add("关闭");
		menu.add("退出");
		Menu irons=new Menu("编辑");
		irons.add("重写");
		irons.add("复制");
		irons.add("删除");
		irons.add("代替");
		irons.add("查找");
		irons.addSeparator();//添加分割线
		irons.add("取消");
		irons.insert("粘贴",2);
		
		MenuBar mb=new MenuBar();
		mb.add(menu);
		mb.add(irons);
		setMenuBar(mb);//将菜单栏与窗口管理
		pop=new PopupMenu("menu");
		pop.add("新建");
		pop.add("粘贴");
		pop.add("取消");
		final TextArea p=new TextArea(100,100);
		p.setBackground(Color.BLUE);
		p.add(pop);
		//事件处理
		p.addMouseListener(new MouseAdapter(){
			public void mouseReleased(java.awt.event.MouseEvent evt){
				if(evt.isPopupTrigger()){
					System.out.println("popup trigger");//输出字符串信息
					System.out.println(evt.getComponent());//输出组件属性
					System.out.println("" +evt.getX()+ ""+evt.getY());
					pop.show(p,evt.getX(),evt.getY());
				}
			}
		});
		this.add(p,BorderLayout.CENTER);//just 添加面板p添加到窗口中
	}
	public static void main(String[] args) {
		new MenuDemo("菜单演示").setVisible(true);
	}
}
