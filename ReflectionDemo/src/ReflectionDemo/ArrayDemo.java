package ReflectionDemo;

import java.lang.reflect.Array;

public class ArrayDemo {
	
	public static void main(String[] args) {
		Person[] persons=new Person[] {
				new Person("张三",18),
				new Person("张三2",182),
				new Person("张三3",183)
		};	
		System.out.println("对象数组的长度："+Array.getLength(persons));
		Class c=persons.getClass();//生成数组对象
		Class c2=Person.class;//生成类对象
		System.out.println("是否为数组类型"+c.isArray());
		System.out.println("是否为数组类型"+c2.isArray());
		//使用array类遍历数组
		for(int i=0;i<Array.getLength(persons);i++)
		{
			System.out.println(Array.get(persons, i));
		}
	}
}
