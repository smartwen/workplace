
public class Kitchen {
	private Brake brake;
	public  static int bigNumber = 0;///���ֳԵ�����
	public static int smallNumber = 0;
	public static int TOTAL_NUMBER = 100;//�������������
	public static int iCount=1; //������  ͳ��
	
	public Kitchen(Brake brake)
	{
		this.brake=brake;
	}
	
	//������ķ���
	public synchronized void make()
	{
		//�жϹ��Ƿ�����
		if(Brake.BRAKE_NUM<10)
		{
			brake.insert(Kitchen.iCount);
			System.out.println("���������˵�"+Kitchen.iCount+"�����");
			Kitchen.iCount++;
			notifyAll();//����2�����ӳ����
		}
		else
		{
			System.out.println("���Ѿ���10��������ȴ����ӳ����");
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

	//������ķ���
	public  synchronized void eat()
	{
		//�жϹ����Ƿ�Ϊ��
		if(Brake.BRAKE_NUM>0)
		{
			int temp=brake.remove();//��óԵ�����ı��
			System.out.println(Thread.currentThread().getName()+"�Ե��˵�"+temp+"�����");
		if(Thread.currentThread().getName().equals("����"))
		{
			bigNumber++;
		}
		else
		{
			smallNumber++;
		}
		notifyAll();//����������������
		}
		else 
		{
			System.out.println("��������� �ȴ����������");
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
