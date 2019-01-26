package com.javaBasicStudy.collection;
//此demo是set接口的实现类 请熟悉并了解学习
import java.util.*;
public class CollectionSetDemo {

	public CollectionSetDemo() {
		// TODO 自动生成的构造函数存根
	}
public static void main(String[] args) {
	Set<People> hashSet=new HashSet<People>();
	hashSet.add(new People("小王",201101));
	hashSet.add(new People("小王2",201102));
	hashSet.add(new People("小王3",201103));
	Iterator<People> it=hashSet.iterator();
	System.out.println("集合中的元素是：");
	while(it.hasNext()){
		People person=it.next();
		System.out.println(person.getName()+ " " +person.getid_card());
	}
}
}
