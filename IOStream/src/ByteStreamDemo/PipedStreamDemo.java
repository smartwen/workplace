package ByteStreamDemo;

import java.io.*;

/*
 * 管道流 案例
 * 一端输入数据 一端接收数据 使用2个线程来控制它们
 */
public class PipedStreamDemo {
	//private static PipedOutputStream pout;

	public static void main(String[] args) {
		
		try {
			PipedOutputStream pout=new PipedOutputStream();
			//创建 PipedInputStream，使其连接到管道输出流 src。
			 PipedInputStream pin = new  PipedInputStream(pout);
			 
			 MyReader mr=new MyReader(pin);
			 MyWriter mw=new MyWriter(pout);
			 
			 Thread t_w=new Thread(mw);
			 Thread t_r=new Thread(mr);
			 
			 t_w.start();
			 t_r.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 
		
		 
	}
	 static class MyReader implements Runnable{
		 PipedInputStream pin=null;
		public MyReader(PipedInputStream pin) {
			this.pin=pin;
		}
		@Override
		public void run() {
			//每次读取一个字节
			int temp;
			
			try {
				while((temp=pin.read())!=-1)
				{
					System.out.print((char)temp);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
static class MyWriter implements Runnable{
 PipedOutputStream pout=null;
public MyWriter(PipedOutputStream pout) {
	this.pout=pout;
}
	@Override
	public void run() {
		String s="Hello world!";
		try {
			System.out.println("等待三秒！");
			Thread.sleep(3000);
			pout.write(s.getBytes());
			pout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
	
}


}
