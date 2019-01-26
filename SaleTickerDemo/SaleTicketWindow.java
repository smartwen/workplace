import java.util.concurrent.atomic.AtomicInteger;

//��Ʊ������
public class SaleTicketWindow {
	Window window;	
	public AtomicInteger saleNum=new AtomicInteger(0);//ÿ�����ڵ���Ʊ���� ��λΪԭ������
	public static AtomicInteger icount=new AtomicInteger(0);//��Ʊ�������� ��λΪԭ������ �ο͵�id
	public static final int MAX_NUM=1000;//ÿ�������Ʊ��
	
	public SaleTicketWindow(Window window) {
		this.window=window;
	}
	//��ȡ��ǰ���ڷ���
	public Window getWindow()
	{
		return this.window;
	}
	public int getsaleNum()
	{
		return this.saleNum.get();
	}
	//�ο��Ŷ���Ʊ�ķ���
	public  synchronized void buyTicket() {
		if(window.getLength()<Window.MAX_LEN)
		{
			if(SaleTicketWindow.icount.get()>=SaleTicketWindow.MAX_NUM)//����Ʊ�Ѿ������ˣ�����������");
			{
				notify();//������Ʊ����
				return;					
			}
			SaleTicketWindow.icount.getAndIncrement();
			window.insert(SaleTicketWindow.icount.get());
			System.out.println(window.getName()+"���ڵ�"+SaleTicketWindow.icount+"���ο͵ȴ���Ʊ");
			notify();//������Ʊ�߳�
		}else
		{
			System.out.println(window.getName()+"���ڶ���������,�ȴ�"+window.getName()+"������Ʊ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//��Ʊ�ķ���
	public synchronized void saleTicket()
	{
		if(window.getLength()>0)
		{
			int temp=window.remove();
			System.out.println(window.getName()+"���������˵�"+temp+"��Ʊ");
			saleNum.getAndIncrement();//��Ʊ��������1
			notify();//������Ʊ�߳�
		}else
		{
			System.out.println(window.getName()+"���ڶ���Ϊ��,�ȴ�"+window.getName()+"�ο��Ŷ���Ʊ");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
