package com.javaBasicStudy.collection;

/**
 * LisIterator ʵ����������б��е�Ԫ��
 * ��demo ListIterator ����ArrayList
 *
 */
import java.util.*;
public class ListIteratorDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println("����ʵ���б������е�Ԫ�أ�");
		for(Iterator<Integer>it =list.iterator();it.hasNext();){
			System.out.print(it.next() +" ");
			
		} 
	 	System.out.print("����ʵ���б������е�Ԫ�أ�");
	ListIterator<Integer> li=list.listIterator();
	for(li=list.listIterator();li.hasNext();){//�α궨λ���б�β��
		li.next();
		}
	for(;li.hasPrevious();){
		System.out.print(li.previous()+ " ");
	}
	}
}

