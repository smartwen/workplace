//生产者消费者问题  java多线程实例项目
public class TestBrake {
	public static void main(String[] args) {
		Brake brake=new Brake();
		Kitchen kitchen=new Kitchen(brake);
		Productor p=new Productor(kitchen);
		Consumer c1=new Consumer(kitchen);
		Consumer c2=new Consumer(kitchen);
		//妈妈线程
		Thread mother=new Thread(p,"妈妈");
		Thread bigSon=new Thread(c1,"大林");
		Thread smallSon=new Thread(c1,"小林");
		mother.start();
		bigSon.start();
		smallSon.start();
		
		try {
			mother.join();
			bigSon.join();
			smallSon.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("大林吃了："+Kitchen.bigNumber+"个面包");
		System.out.println("小林吃了："+Kitchen.smallNumber+"个面包");

	}
}
