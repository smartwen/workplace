
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

//�׶���Ŀ֮ģ�⾰����Ʊ������Ʊ ���߳�
//������
public class Window {
	String name;
	//��ǰ����Ԫ�س��ȵ����� ʹ��ԭ������ 
	private AtomicInteger len=new AtomicInteger(0);
	 static final int MAX_LEN=10;//���е����ֵ
	//����һ��֧��ͬ���ļ�������   ����������
	Vector<Integer> queue=new Vector<Integer>();
	
	public Window(String name) {
		this.name=name;
	}
	//��õ�ǰ����Ԫ�صĳ���
	public int getLength() {
		return this.len.get();//��ȡ��ǰֵ
	}
	public String getName() {
		return name;
	}
	
	//��ӵķ���
	public synchronized void insert(int number) {
		queue.add(number);
		this.len.getAndIncrement();//��������1
	}
	//���ӵķ���
	public synchronized int remove() {
		this.len.getAndDecrement();//���г��ȼ�1
		return queue.remove(0);//��ȡ����ͷԪ��  �Ƚ��ȳ� �Ŷӹ���
	}
}
