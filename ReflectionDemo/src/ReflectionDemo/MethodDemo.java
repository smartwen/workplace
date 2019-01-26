package ReflectionDemo;

import java.lang.reflect.Method;

public class MethodDemo {
	public static void main(String[] args) {
		Class <?> c=null;
		try {
			 c=Class.forName("ReflectionDemo.Person");
			 System.out.println("获得所有的公有方法");
			 Method[] methods=c.getMethods();
			 for(int i=0;i<methods.length;i++)
			 {
				 System.out.println(methods[i].getName());
				// System.out.println(methods[i].toGenericString());
			 }
			 
			 Person p=(Person) c.newInstance();//动态实列化对象
			 Method m=c.getMethod("sayhello", new Class[] {String.class});
			 System.out.println("调用sayhello方法");
			 m.invoke(p, "李明");
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
