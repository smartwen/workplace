package com.javaBasicStudy.collection;
import java.util.*;
public class Gather  {
//ʵ���˿ɱ������ ��������Ԫ�� ����null
	public Gather() {
		// TODO �Զ����ɵĹ��캯�����
	}
public static void main(String[] args) {
	//�������϶���  ����ʵ���˿ɱ������ 
	List<String> list=new ArrayList<String>();
	int i=(int) (Math.random()*(list.size()-1));
	list.add("a");
	list.add("b");
	list.add("c");
	//System.out.println(list.size());
	System.out.println("�����ȡ�����е�Ԫ�أ�"+list.get(i));
	list.remove(2);
	System.out.println("���ϵĳ���Ϊ��"+list.size());
	System.out.println("��������2��Ԫ�ش������Ƴ��������е�Ԫ���ǣ�");
	try {
		for(int j=0;i<list.size();j++){
			System.out.println(list.get(j)+ " ");
		}
	} catch (IndexOutOfBoundsException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
}
}
