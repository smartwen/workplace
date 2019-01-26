package com.javaBasicStudy.collection;
import java.util.*;
public class GeneralForDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println("列表中的元素是："+list);
		System.out.println("列表中的奇数序号元素是：");
		for(int j=1;j<list.size();j+=2){
			System.out.println(list.get(j)+ " ");
		}
	}
	}

//就是一个案例说明 for循环遍历arrayList而已   一个List集合中进行for循环遍历