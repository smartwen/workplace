package com.javaBasicStudy.collection;
import java.util.*;
/*
��demo˵��map�ӿڵ�ʵ���� ����hashMap����ӻ�ɾ��ӳ���ϵЧ�����
*/public class CollectionMapDemo {

public static void main(String[] args) {
	Map map=new HashMap();
	Emp emp=new Emp("001","����");
	Emp emp2=new Emp("002","����2");
	Emp emp3=new Emp("003","����3");
	map.put(emp.getE_id(),emp.getE_name());
	map.put(emp2.getE_id(),emp2.getE_name());
	map.put(emp3.getE_id(),emp3.getE_name());
	Set set=map.keySet();//��ȡmap�����е�key���󼯺�
	Iterator it=set.iterator();
	System.out.println("hashMap��ʵ�ֵ�Map���� ,����");
	while(it.hasNext()){
		String str=(String) it.next();
		String name=(String) map.get(str);//��ȡ���������е�key����
		System.out.println(str +" "+name);
	}
	
	TreeMap treemap=new TreeMap();
	treemap.putAll(map);
	Iterator iter=treemap.keySet().iterator();
	System.out.println("TreeMap��ʵ�ֵ�Map���ϣ�����������");
	while(iter.hasNext()){
		String str=(String) iter.next();
		String name=(String) treemap.get(str);
		System.out.println(str +" "+name);
	}
	}
}
class Emp{
	private String e_id;
	private String e_name;
	public Emp(String e_id,String e_name){
		this.e_id=e_id;
		this.e_name=e_name;
	}
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	
}