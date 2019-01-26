package com.javaBasicStudy.collection;
/*
set集合中不允许存在重复值
*/import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("pear");
		list.add("banana");
		list.add("apple");
		Set<String> set=new HashSet<String>();
		set.addAll(list);
		Iterator<String> it=set.iterator();//创建set集合迭代器
		System.out.println("集合中的元素是：");
		while(it.hasNext()){
			System.out.println(it.next()+"\t");
		}
	}

	public CollectionDemo() {
		// TODO 自动生成的构造函数存根
	}

}
