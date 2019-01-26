package ReflectionDemo;

public class InterfaceDemo {
	public static void main(String[] args) {
		Class <?> c=null;
		try {
			 c=Class.forName("ReflectionDemo.Person");
			 System.out.println("获得所有接口信息");
			 Class[] interfaces=c.getInterfaces();
			 for(int i=0;i<interfaces.length;i++)
			 {
				 System.out.println(interfaces[i].toString());
			 }
			 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
