
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

//阶段项目之模拟景区售票窗口售票 多线程
//窗口类
public class Window {
	String name;
	//当前队列元素长度的属性 使用原子类型 
	private AtomicInteger len=new AtomicInteger(0);
	 static final int MAX_LEN=10;//队列的最大值
	//创建一个支持同步的集合类型   来当缓冲区
	Vector<Integer> queue=new Vector<Integer>();
	
	public Window(String name) {
		this.name=name;
	}
	//获得当前队列元素的长度
	public int getLength() {
		return this.len.get();//获取当前值
	}
	public String getName() {
		return name;
	}
	
	//入队的方法
	public synchronized void insert(int number) {
		queue.add(number);
		this.len.getAndIncrement();//队列自增1
	}
	//出队的方法
	public synchronized int remove() {
		this.len.getAndDecrement();//队列长度减1
		return queue.remove(0);//获取队列头元素  先进先出 排队规则
	}
}
