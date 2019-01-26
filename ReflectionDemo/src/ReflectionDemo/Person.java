package ReflectionDemo;

import java.io.Serializable;

public class Person implements Serializable,Comparable{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {}
	Person(String name){
		this.name=name;
	}
	
	private Person(int age)
	{
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ĞÕÃû£º "+this.name+" ÄêÁä: "+this.age;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void sayhello(String name) {
		System.out.println("ÄãºÃ"+name);
	}
}
