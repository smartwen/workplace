package ReflectionDemo;

import java.lang.reflect.Method;

public class MethodDemo {
	public static void main(String[] args) {
		Class <?> c=null;
		try {
			 c=Class.forName("ReflectionDemo.Person");
			 System.out.println("������еĹ��з���");
			 Method[] methods=c.getMethods();
			 for(int i=0;i<methods.length;i++)
			 {
				 System.out.println(methods[i].getName());
				// System.out.println(methods[i].toGenericString());
			 }
			 
			 Person p=(Person) c.newInstance();//��̬ʵ�л�����
			 Method m=c.getMethod("sayhello", new Class[] {String.class});
			 System.out.println("����sayhello����");
			 m.invoke(p, "����");
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
