package DynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理类
public class MyDinnerProxy implements InvocationHandler{

	//被代理的原始对象
	private Object originalObject;
	//方法用来绑定代理对象
	public Object bind(Object obj)
	{
		this.originalObject=obj;
		//返回一个代理对象
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	private void beforeDinner() {
		System.out.println("饭前洗手");
	}
	
	private void afterDinner() {
		System.out.println("饭后洗碗");
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=null;
		beforeDinner();
		result=method.invoke(this.originalObject, args);
		afterDinner();
		return result;
	}

}
