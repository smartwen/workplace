package com.javaBasicStudy.collection;
//��demo��set�ӿڵ�ʵ���� ����Ϥ���˽�ѧϰ
import java.util.*;
public class CollectionSetDemo {

	public CollectionSetDemo() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) {
	Set<People> hashSet=new HashSet<People>();
	hashSet.add(new People("С��",201101));
	hashSet.add(new People("С��2",201102));
	hashSet.add(new People("С��3",201103));
	Iterator<People> it=hashSet.iterator();
	System.out.println("�����е�Ԫ���ǣ�");
	while(it.hasNext()){
		People person=it.next();
		System.out.println(person.getName()+ " " +person.getid_card());
	}
}
}
