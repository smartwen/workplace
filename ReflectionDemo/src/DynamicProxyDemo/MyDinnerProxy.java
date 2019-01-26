package DynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//������
public class MyDinnerProxy implements InvocationHandler{

	//�������ԭʼ����
	private Object originalObject;
	//���������󶨴������
	public Object bind(Object obj)
	{
		this.originalObject=obj;
		//����һ���������
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	private void beforeDinner() {
		System.out.println("��ǰϴ��");
	}
	
	private void afterDinner() {
		System.out.println("����ϴ��");
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
