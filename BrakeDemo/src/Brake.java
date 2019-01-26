import java.util.Stack;

//生产者消费者 问题 面包类
public class Brake {
	//做面包的锅 最多十个面包
	public static final int MAX_NUMBER=10;
	Stack<Integer> stack=new Stack<Integer>();
	public static int BRAKE_NUM=0; //面包的个数
	
	//做面包
	public synchronized  void insert(int number)
	{
		stack.push(number);
		Brake.BRAKE_NUM++;//锅里面包数+1
	}
	
	//拿面包
	public synchronized int remove()
	{
		
		Brake.BRAKE_NUM--;
		return stack.pop(); //出栈
	}
}
