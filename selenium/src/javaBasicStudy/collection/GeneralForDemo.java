package com.javaBasicStudy.collection;
import java.util.*;
public class GeneralForDemo {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		System.out.println("�б��е�Ԫ���ǣ�"+list);
		System.out.println("�б��е��������Ԫ���ǣ�");
		for(int j=1;j<list.size();j+=2){
			System.out.println(list.get(j)+ " ");
		}
	}
	}

//����һ������˵�� forѭ������arrayList����   һ��List�����н���forѭ������