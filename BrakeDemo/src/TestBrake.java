//����������������  java���߳�ʵ����Ŀ
public class TestBrake {
	public static void main(String[] args) {
		Brake brake=new Brake();
		Kitchen kitchen=new Kitchen(brake);
		Productor p=new Productor(kitchen);
		Consumer c1=new Consumer(kitchen);
		Consumer c2=new Consumer(kitchen);
		//�����߳�
		Thread mother=new Thread(p,"����");
		Thread bigSon=new Thread(c1,"����");
		Thread smallSon=new Thread(c1,"С��");
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
		System.out.println("���ֳ��ˣ�"+Kitchen.bigNumber+"�����");
		System.out.println("С�ֳ��ˣ�"+Kitchen.smallNumber+"�����");

	}
}
