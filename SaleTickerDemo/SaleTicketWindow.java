import java.util.concurrent.atomic.AtomicInteger;

//售票窗口类
public class SaleTicketWindow {
	Window window;	
	public AtomicInteger saleNum=new AtomicInteger(0);//每个窗口的售票数量 定位为原子类型
	public static AtomicInteger icount=new AtomicInteger(0);//售票的总数量 定位为原子类型 游客的id
	public static final int MAX_NUM=1000;//每天最多售票数
	
	public SaleTicketWindow(Window window) {
		this.window=window;
	}
	//获取当前窗口方法
	public Window getWindow()
	{
		return this.window;
	}
	public int getsaleNum()
	{
		return this.saleNum.get();
	}
	//游客排队买票的方法
	public  synchronized void buyTicket() {
		if(window.getLength()<Window.MAX_LEN)
		{
			if(SaleTicketWindow.icount.get()>=SaleTicketWindow.MAX_NUM)//今天票已经卖完了，明天在来吧");
			{
				notify();//唤醒售票窗口
				return;					
			}
			SaleTicketWindow.icount.getAndIncrement();
			window.insert(SaleTicketWindow.icount.get());
			System.out.println(window.getName()+"窗口第"+SaleTicketWindow.icount+"个游客等待买票");
			notify();//唤醒售票线程
		}else
		{
			System.out.println(window.getName()+"窗口队伍已排满,等待"+window.getName()+"窗口售票");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//卖票的方法
	public synchronized void saleTicket()
	{
		if(window.getLength()>0)
		{
			int temp=window.remove();
			System.out.println(window.getName()+"窗口卖掉了第"+temp+"张票");
			saleNum.getAndIncrement();//卖票数量自增1
			notify();//唤醒买票线程
		}else
		{
			System.out.println(window.getName()+"窗口队伍为空,等待"+window.getName()+"游客排队买票");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
