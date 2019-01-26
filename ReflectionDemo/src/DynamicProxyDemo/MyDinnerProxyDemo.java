package DynamicProxyDemo;
//测试类
public class MyDinnerProxyDemo {
	public static void main(String[] args) {
		Dinner din=new MyDinner();
		//不使用代理对象
		//din.haveDinner();
		MyDinnerProxy proxy=new MyDinnerProxy();
	//返回一个代理对象
		din=(Dinner) proxy.bind(din);
		//执行代理对象的方法
		din.haveDinner();
	}
	
}
