//������������
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
			//��ν����������߳�
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
