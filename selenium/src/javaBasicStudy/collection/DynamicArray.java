package com.javaBasicStudy.collection;
import java.awt.*;
/*
arrayList��һ����̬���ȵ����飬������ʱ������������Ԫ��
*/public class DynamicArray {
Frame f;
TextField tf;
Button bt1,bt2;
Panel p;
public DynamicArray(){
	Frame f=new Frame("�ö�̬���鱣��ѧ����");
	p=new Panel();
	bt1=new Button();
	bt2=new Button();
	tf=new TextField();
	p.add(bt1);
	
	}


public static void main(String[] args) {
	new DynamicArray();
}
}
