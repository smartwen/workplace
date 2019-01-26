/**
 * 
 */
package com.javaBasicStudy.collection;

/**
 * @author Administrator
 * Iterator遍历ArrayList
 *
 */
import java.util.*;
public class IteratorDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println("列表中的的全部元素：");
		for(Iterator<Integer> it=list.iterator();it.hasNext();){
			System.out.println(it.next() + " ");
		}
				
		
		
	}
}



