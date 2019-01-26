//生产者类  是游客排队买票
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
				saleWindow.buyTicket();//不停的买票
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("今天的"+SaleTicketWindow.MAX_NUM+"张票卖完了  回去吧");
	}
	
}
