package com.javaBasicStudy.swing;
import java.awt.Container;
import java.net.URL;
/*//
 * Exception in thread "main" java.lang.NullPointerException
	at javax.swing.ImageIcon.<init>(Unknown Source)
	at com.javaBasicStudy.swing.MyImageIcon.<init>(MyImageIcon.java:12)
	at com.javaBasicStudy.swing.MyImageIcon.main(MyImageIcon.java:22)

*/import javax.swing.*;
public class MyImageIcon extends JFrame{
	public MyImageIcon(){
		Container container=getContentPane();
		JLabel jl=new JLabel("JFrame����",JLabel.CENTER);
		//��ȡͼƬ���ڵ�URL ��imageButton.jpgͼƬ�����ļ�����һ��Ŀ¼��
		URL url=MyImageIcon.class.getResource("imageButton.jpg");
		Icon icon=new ImageIcon(url);
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);
		container.add(jl);
		setSize(250,100);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	new MyImageIcon();
}
}
