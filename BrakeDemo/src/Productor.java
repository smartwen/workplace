//�������� 
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
			if(Kitchen.iCount>100)//һ�ٸ��������
			{
				break;				
			}else
			{
				try {
					kitchen.make();//���費�������
					Thread.sleep(150);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		}
		System.out.println("100�����������");
	}
	
}
