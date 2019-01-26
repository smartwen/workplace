/*package com.javaBasicStudy.swing;
import java.awt.*;


列表框组件  实现listModel接口 自定义一个类实现abstractListModel类

import javax.swing.*;

public class JListTest extends JFrame{

	public JListTest() {
		// TODO 自动生成的构造函数存根
		JFrame jf=new JFrame("在这个窗体中使用下拉框");
	

		cp.setLayout(null);
		//JList jl=new JList(ListModel dataModel);
		JList jl=new JList(new MyListModel());
		JScrollPane js=new JScrollPane(jl);
		js.setBounds(10, 10, 100, 100);
		cp.add(js);
		setSize(320,240);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	//main方法
	public static void main(String[] args) {
		new JListTest();
	}

}



class MyListModel extends AbstractListModel implements ListModel{
	
	private String[] contents={"列表1","列表2","列表3","列表4"};

	@Override
	public int getSize() {
		// TODO 自动生成的方法存根
		return contents.length;
	}

	@Override
	public Object getElementAt(int index) {
		// TODO 自动生成的方法存根
		if(index<contents.length)
			return contents[index++];
		else
			return null;
	}
}*/