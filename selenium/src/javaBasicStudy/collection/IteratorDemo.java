/**
 * 
 */
package com.javaBasicStudy.collection;

/**
 * @author Administrator
 * Iterator����ArrayList
 *
 */
import java.util.*;
public class IteratorDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println("�б��еĵ�ȫ��Ԫ�أ�");
		for(Iterator<Integer> it=list.iterator();it.hasNext();){
			System.out.println(it.next() + " ");
		}
				
		
		
	}
}



