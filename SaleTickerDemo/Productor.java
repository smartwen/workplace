//��������  ���ο��Ŷ���Ʊ
public class Productor implements Runnable{
	private SaleTicketWindow saleWindow;
	public Productor(SaleTicketWindow saleWindow) {
		this.saleWindow=saleWindow;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			if(SaleTicketWindow.icount.get()>=SaleTicketWindow.MAX_NUM)
			{
				break;
			}
			try {
				saleWindow.buyTicket();//��ͣ����Ʊ
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�����"+SaleTicketWindow.MAX_NUM+"��Ʊ������  ��ȥ��");
	}
	
}
