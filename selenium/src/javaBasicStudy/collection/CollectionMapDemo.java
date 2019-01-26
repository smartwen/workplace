package com.javaBasicStudy.collection;
import java.util.*;
/*
此demo说明map接口的实现类 其中hashMap类添加或删除映射关系效率最高
*/public class CollectionMapDemo {

public static void main(String[] args) {
	Map map=new HashMap();
	Emp emp=new Emp("001","老王");
	Emp emp2=new Emp("002","老王2");
	Emp emp3=new Emp("003","老王3");
	map.put(emp.getE_id(),emp.getE_name());
	map.put(emp2.getE_id(),emp2.getE_name());
	map.put(emp3.getE_id(),emp3.getE_name());
	Set set=map.keySet();//获取map集合中的key对象集合
	Iterator it=set.iterator();
	System.out.println("hashMap类实现的Map集合 ,无序：");
	while(it.hasNext()){
		String str=(String) it.next();
		String name=(String) map.get(str);//获取集合中所有的key对象
		System.out.println(str +" "+name);
	}
	
	TreeMap treemap=new TreeMap();
	treemap.putAll(map);
	Iterator iter=treemap.keySet().iterator();
	System.out.println("TreeMap类实现的Map集合，键对象升序：");
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