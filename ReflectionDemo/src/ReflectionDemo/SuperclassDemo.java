package ReflectionDemo;

public class SuperclassDemo {
	public static void main(String[] args) {
		Class <?> c=null;
		try {
			 c=Class.forName("ReflectionDemo.Person");
			 System.out.println("������г�����Ϣ");
			 Class<?> superclass=c.getSuperclass();
			System.out.println(superclass.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
