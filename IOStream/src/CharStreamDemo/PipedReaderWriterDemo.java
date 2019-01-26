package CharStreamDemo;

import java.io.*;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedReaderWriterDemo {
public static void main(String[] args) {
		
		try {
			PipedWriter pout=new PipedWriter();
			
			 PipedReader pin = new  PipedReader(pout);
			 
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
		 PipedReader pin=null;
		public MyReader(PipedReader pin) {
			this.pin=pin;
		}
		@Override
		public void run() {
			//每次读取一个字节
			char[] buff=new char[1024];
			
			try {
				while(pin.read(buff)!=-1)
				{
					System.out.print(new String(buff));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
static class MyWriter implements Runnable{
 PipedWriter pout=null;
public MyWriter(PipedWriter pout) {
	this.pout=pout;
}
	@Override
	public void run() {
		String s="你好 中国!";
		try {
			System.out.println("等待三秒！");
			Thread.sleep(3000);
			pout.write(s);
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
