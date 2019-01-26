import java.util.Stack;

//������������ ���� �����
public class Brake {
	//������Ĺ� ���ʮ�����
	public static final int MAX_NUMBER=10;
	Stack<Integer> stack=new Stack<Integer>();
	public static int BRAKE_NUM=0; //����ĸ���
	
	//�����
	public synchronized  void insert(int number)
	{
		stack.push(number);
		Brake.BRAKE_NUM++;//���������+1
	}
	
	//�����
	public synchronized int remove()
	{
		
		Brake.BRAKE_NUM--;
		return stack.pop(); //��ջ
	}
}
