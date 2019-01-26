//消费者类  售票窗口不停售票
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
				saleWindow.saleTicket();//不停的卖票
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("今天的"+SaleTicketWindow.MAX_NUM+"张票卖完了  回去吧");
	}
}
