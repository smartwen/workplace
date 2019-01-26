package com.javaBasicStudy.collection;

/**
 * LisIterator 实现逆序遍历列表中的元素
 * 本demo ListIterator 遍历ArrayList
 *
 */
import java.util.*;
public class ListIteratorDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println("正序实现列表中所有的元素：");
		for(Iterator<Integer>it =list.iterator();it.hasNext();){
			System.out.print(it.next() +" ");
			
		} 
	 	System.out.print("倒序实现列表中所有的元素：");
	ListIterator<Integer> li=list.listIterator();
	for(li=list.listIterator();li.hasNext();){//游标定位到列表尾部
		li.next();
		}
	for(;li.hasPrevious();){
		System.out.print(li.previous()+ " ");
	}
	}
}

