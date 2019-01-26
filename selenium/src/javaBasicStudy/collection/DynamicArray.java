package com.javaBasicStudy.collection;
import java.awt.*;
/*
arrayList是一个动态长度的数组，可以随时向数组中增减元素
*/public class DynamicArray {
Frame f;
TextField tf;
Button bt1,bt2;
Panel p;
public DynamicArray(){
	Frame f=new Frame("用动态数组保存学生名");
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
