//��������  ��Ʊ���ڲ�ͣ��Ʊ
public class Consumer implements Runnable{
	private SaleTicketWindow saleWindow;
	public Consumer(SaleTicketWindow saleWindow) {
		this.saleWindow=saleWindow;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(SaleTicketWindow.icount.get()>=SaleTicketWindow.MAX_NUM&&saleWindow.getWindow().getLength()<=0)
			{
				break;
			}
			try {
				saleWindow.saleTicket();//��ͣ����Ʊ
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("�����"+SaleTicketWindow.MAX_NUM+"��Ʊ������  ��ȥ��");
	}
}
