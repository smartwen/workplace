package com.javaBasicStudy.collection;
/*//set接口的实现类
Set<String> collSet=new HashSet<String>();
Set<String> collset2=new TreeSet<String>();
*/

public class People {
private String name;
private long id_card;
	public People(String name,long id_card) {
		// TODO 自动生成的构造函数存根
		this.name=name;
		this.id_card=id_card;
	}
	public long getid_card(){
		return id_card;
	}
	public void setid_card(){
		this.id_card=id_card;
	}
	public String getName(){
		return name;
	}
	public void setName(){
		this.name=name;
	}

}
