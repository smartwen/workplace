/*package com.javaBasicStudy.swing;
import java.awt.*;


�б�����  ʵ��listModel�ӿ� �Զ���һ����ʵ��abstractListModel��

import javax.swing.*;

public class JListTest extends JFrame{

	public JListTest() {
		// TODO �Զ����ɵĹ��캯�����
		JFrame jf=new JFrame("�����������ʹ��������");
	

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
	
	//main����
	public static void main(String[] args) {
		new JListTest();
	}

}



class MyListModel extends AbstractListModel implements ListModel{
	
	private String[] contents={"�б�1","�б�2","�б�3","�б�4"};

	@Override
	public int getSize() {
		// TODO �Զ����ɵķ������
		return contents.length;
	}

	@Override
	public Object getElementAt(int index) {
		// TODO �Զ����ɵķ������
		if(index<contents.length)
			return contents[index++];
		else
			return null;
	}
}*/