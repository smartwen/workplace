package ReflectionDemo;

import java.lang.reflect.Array;

public class ArrayDemo {
	
	public static void main(String[] args) {
		Person[] persons=new Person[] {
				new Person("����",18),
				new Person("����2",182),
				new Person("����3",183)
		};	
		System.out.println("��������ĳ��ȣ�"+Array.getLength(persons));
		Class c=persons.getClass();//�����������
		Class c2=Person.class;//���������
		System.out.println("�Ƿ�Ϊ��������"+c.isArray());
		System.out.println("�Ƿ�Ϊ��������"+c2.isArray());
		//ʹ��array���������
		for(int i=0;i<Array.getLength(persons);i++)
		{
			System.out.println(Array.get(persons, i));
		}
	}
}
