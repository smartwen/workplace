//定义消费者类
public class Consumer implements Runnable{
	private Kitchen kitchen;
	public Consumer(Kitchen kitchen)
	{
		this.kitchen=kitchen;
	}
	@Override
	public void run() {
		while(true) 
		{
			//如何结束消费者线程
			if(Kitchen.iCount>100&&Brake.BRAKE_NUM<=0)
			{
				break;
			}else
			{
				try {
					kitchen.eat();
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
	}
}
