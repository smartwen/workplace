package com.javaBasicStudy.Twelve;
import java.awt.*;
import java.awt.event.*;
/*//
 * Ϊ�������¼�������ʱ���������¼������ڲ����������ķ�ʽʹ��
*/public class ListenerInnerClass {
	private Frame f;
	private TextField tf;
public static void main(String[] args) {
	ListenerInnerClass li=new ListenerInnerClass();
	li.show();
}
	private void show() {
	// TODO �Զ����ɵķ������
		f.add("North",tf);
		f.addMouseMotionListener(new MyMouseMotionListener());
	
		f.setSize(320,240);
		
		//������f��Ӽ�����
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				f.setVisible(false);
				f.dispose();
				System.exit(1);
			}
		});
		f.setSize(320,240);
		f.setVisible(true);
	
}
	public ListenerInnerClass() {
		// TODO �Զ����ɵĹ��캯�����
		f=new Frame("�������ڲ��࣬�������ƶ����");
		tf=new TextField(20);
	}
//�½���Ա�ڲ���
	class MyMouseMotionListener extends MouseMotionAdapter{
		public void mouseMoved(MouseEvent e){
			//����tf����ʾ�ı�����
			tf.setText("�������Ϊ��x="+e.getX()+"Y="+e.getY());
		}
	}
}
