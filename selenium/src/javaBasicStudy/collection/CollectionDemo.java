package com.javaBasicStudy.collection;
/*
set�����в���������ظ�ֵ
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
		Iterator<String> it=set.iterator();//����set���ϵ�����
		System.out.println("�����е�Ԫ���ǣ�");
		while(it.hasNext()){
			System.out.println(it.next()+"\t");
		}
	}

	public CollectionDemo() {
		// TODO �Զ����ɵĹ��캯�����
	}

}
