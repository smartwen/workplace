package com.javaBasicStudy.collection;
import java.util.*;
public class Gather  {
//实现了可变的数组 允许所有元素 包括null
	public Gather() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	//创建集合对象  该类实现了可变的数组 
	List<String> list=new ArrayList<String>();
	int i=(int) (Math.random()*(list.size()-1));
	list.add("a");
	list.add("b");
	list.add("c");
	//System.out.println(list.size());
	System.out.println("随机获取数组中的元素："+list.get(i));
	list.remove(2);
	System.out.println("集合的长度为："+list.size());
	System.out.println("将索引是2的元素从数组移除后，数组中的元素是：");
	try {
		for(int j=0;i<list.size();j++){
			System.out.println(list.get(j)+ " ");
		}
	} catch (IndexOutOfBoundsException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
}
}
