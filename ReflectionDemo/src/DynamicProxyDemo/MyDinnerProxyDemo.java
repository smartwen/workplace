package DynamicProxyDemo;
//������
public class MyDinnerProxyDemo {
	public static void main(String[] args) {
		Dinner din=new MyDinner();
		//��ʹ�ô������
		//din.haveDinner();
		MyDinnerProxy proxy=new MyDinnerProxy();
	//����һ���������
		din=(Dinner) proxy.bind(din);
		//ִ�д������ķ���
		din.haveDinner();
	}
	
}
