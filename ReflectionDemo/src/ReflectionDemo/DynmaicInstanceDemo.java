package ReflectionDemo;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import ReflectionDemo.Person;
/*
 * 动态实列化对象
 */
public class DynmaicInstanceDemo {
	public static void main(String[] args) {
		//Class<?> c=null;
		try {
			Class<?> c=Class.forName("ReflectionDemo.Person");
			@SuppressWarnings("unused")
			Constructor constructor=c.getConstructor(new Class[] {String.class,int.class});
			Person p=(Person) constructor.newInstance("张三丰",60);
			System.out.println(p.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
