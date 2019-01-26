//生产者类 
public class Productor implements Runnable{
	private Kitchen kitchen;
	public Productor(Kitchen kitchen)
	{
		this.kitchen=kitchen;
	}
	@Override
	public void run() {
		while(true)
		{
			if(Kitchen.iCount>100)//一百个面包做完
			{
				break;				
			}else
			{
				try {
					kitchen.make();//妈妈不断做面包
					Thread.sleep(150);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		}
		System.out.println("100个面包做完了");
	}
	
}
