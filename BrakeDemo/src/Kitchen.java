
public class Kitchen {
	private Brake brake;
	public  static int bigNumber = 0;///大林吃的数量
	public static int smallNumber = 0;
	public static int TOTAL_NUMBER = 100;//做面面包的总数
	public static int iCount=1; //计数器  统计
	
	public Kitchen(Brake brake)
	{
		this.brake=brake;
	}
	
	//做面包的方法
	public synchronized void make()
	{
		//判断锅是否已满
		if(Brake.BRAKE_NUM<10)
		{
			brake.insert(Kitchen.iCount);
			System.out.println("妈妈做完了第"+Kitchen.iCount+"个面包");
			Kitchen.iCount++;
			notifyAll();//唤醒2个儿子吃面包
		}
		else
		{
			System.out.println("锅已经有10个面包，等待儿子吃面包");
			try
			{
				wait();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}

	//吃面包的方法
	public  synchronized void eat()
	{
		//判断锅里是否为空
		if(Brake.BRAKE_NUM>0)
		{
			int temp=brake.remove();//获得吃掉面包的编号
			System.out.println(Thread.currentThread().getName()+"吃掉了第"+temp+"个面包");
		if(Thread.currentThread().getName().equals("大林"))
		{
			bigNumber++;
		}
		else
		{
			smallNumber++;
		}
		notifyAll();//唤醒妈妈继续做面包
		}
		else 
		{
			System.out.println("面包吃完了 等待妈妈做面包");
			try
			{
				wait();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
