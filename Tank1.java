/**
 * 
 */
package Tank;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import javax.swing.*;

/**
 * @author Administrator
 *����������, MyPanel�������ҵ�̹��
 *2.����ɫ̹��
 *lession3.���ĸ������̹��
 *4.̹�˶�����+����3������̹��
 *5.�����ӵ����ӵ������߳���
 *6.�ӵ������������ӵ�ֻ�ڻ����л
 *7.�����ӵ��������� KeyEvent.VK_J���ӵ�����̹�˷��� 2��forѭ��
 *8.���뱬ը��ͼƬ myPanel()�½�ͼƬ������ԭ�������½���ը�࣬��paint()�ﻭ��ըЧ����ͼƬ�ǺͰ�ͬһ��Ŀ¼
 *9.����̹�˶����� �����߳���,�ѵ��Զ������ػ�
 *10.����̹��Χ����Ļת������̹�˷����ӵ� �ڻ�̹��ʱ �������ӵ�
 *11.����̹�˲��ܻ�����ײ 
 *12.������ʼ��Ϸʱ�Ĺؿ���ʾ���
 *13.��������Ϸ�˵� ��ʼ�ҵ����    ��ԭ�������½�Jilu�� ���徲̬���������������٣�Ȼ���ڻ���˫�����������
 *MyPanel����tjsl()������ ����̹���������� ��ʾ�����
 *14.ÿ�ο�����Ϸʱ���Զ�����ϴδ���̹������  �����������ʾ
 *15.�����˳� �ڼ�¼���½�2������ MyPanel()����ö�ȡ��¼����
 *16.�½������˳�����  �½�λ����
 *17.Jilu���½����̷���  MyPanel()�޸Ĺ��췽�� ����if else�ж�
 *18.���ϳ�������
 */
public class Tank1 extends JFrame implements ActionListener{
	private MyPanel mp=null;
	private GuangkaPanel gkmp=null;
	private JMenuBar jmenuBar;
	private JMenu cd1;
	private JMenuItem cdx1,cdx2,cdx3,cdx4;
	public Tank1() {
		jmenuBar=new JMenuBar();
		cd1=new JMenu("��Ϸ(G)");
		cd1.setMnemonic('G');
		cdx1=new JMenuItem("����Ϸ(N)");
		cdx2=new JMenuItem("�˳���Ϸ(E)");
		cdx3=new JMenuItem("�����˳�(C)");
		cdx4=new JMenuItem("������Ϸ(S)");
		cdx1.addActionListener(this);cdx2.addActionListener(this);
		cdx3.addActionListener(this);cdx4.addActionListener(this);
		cdx1.setActionCommand("newGame");cdx2.setActionCommand("exit");
		cdx3.setActionCommand("saveExit");cdx4.setActionCommand("goonGame");
		cd1.add(cdx1);cd1.add(cdx2);cd1.add(cdx3);cd1.add(cdx4);
		jmenuBar.add(cd1);
		this.setJMenuBar(jmenuBar);
		this.setIconImage((new ImageIcon("tank.jpg")).getImage());
		
		gkmp=new GuangkaPanel();	
		Thread t=new Thread(gkmp);
		t.start();
		this.add(gkmp);		
		
		this.setSize(600, 500);
		this.setLocation(300, 280);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("���ĵ�̹�˴�ս");
	}
	public static void main(String[] args) {
		Tank1 t1=new Tank1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("newGame"))//����Ϸ�¼�
		{
			mp=new MyPanel("newGame");
			this.remove(gkmp);
			this.add(mp);
			this.addKeyListener(mp);
			Thread t=new Thread(mp);
			t.start();
			this.setVisible(true);
		}
		else if(e.getActionCommand().equals("goonGame"))//������Ϸ
		{
			//��װ
			mp=new MyPanel("goonGame");		
			Thread t=new Thread(mp);
			t.start();
			this.remove(gkmp);
			this.add(mp);		
			this.addKeyListener(mp);
			this.setVisible(true);
		}
		else if(e.getActionCommand().equals("saveExit"))//�����˳�
		{
			Jilu jl=new Jilu();
			jl.setDtk(mp.dtk);//�����µ���̹�˵����
			jl.cunpan();
			System.exit(0);
		}
		else if(e.getActionCommand().equals("exit"))//ֱ���˳���Ϸ
		{
			Jilu.bcjl();
			System.exit(0);
		}
	}
}
class GuangkaPanel extends JPanel implements Runnable{
	int times=0;
public void paint(Graphics g) {		
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		if(times%2==0) {//���ؿ����,ʱ�������˸��Ч��
			g.setColor(Color.yellow);
			Font myFont=new Font("�����п�",Font.BOLD,38);
			g.setFont(myFont);
			g.drawString("��1��", 140, 140);
		}
}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(600);//������ٳ�����˸
			} catch (Exception e) {e.printStackTrace();}
			times++;
			this.repaint();
		}
	}	
}
/**
 * @author Administrator
 *������̹��
 */
class MyPanel extends JPanel implements KeyListener, Runnable{

	 MyTank mt=null;
	 DiTank dt=null;
	//����̹�˶��߳� ʹ��vector����  ̹���� ����
	Vector<DiTank> dtk=new Vector<DiTank>();
	Vector<Baozha> bzjh=new Vector<Baozha>();	
	static Vector<Weizhi> wzjh=new Vector<Weizhi>();

	int tksl=3;
	//��ըҲ��Ҫ����������3��ͼƬ
	Image tp1=null;
	Image tp2=null;
	Image tp3=null;
	
	public MyPanel(String ss) {
		//��һ����ȡӲ������
		Jilu.dqjl();
		mt=new MyTank(140,232);
		if(ss=="newGame") {			
			for(int i=0;i<tksl;i++) {
				 dt=new DiTank((i)*180+5, 0);
				dt.setFangxiang(2);
				Thread t2=new Thread(dt);
				t2.start();//����̹�������߳�
				Zidan zd=new Zidan(dt.x+10,dt.y+30,2);
				dt.dzd.add(zd);
				Thread t3=new Thread(zd);//���˷����ӵ��߳�
				t3.start();
				dtk.add(dt);
				dt.dtkxl(dtk);//?
			}
		}else if(ss.equals("goonGame")) {
			wzjh=Jilu.dupan();
			for(int i=0;i<wzjh.size();i++) {
				Weizhi wz=wzjh.get(i);
				DiTank dt=new DiTank(wz.x,wz.y);
				dt.setFangxiang(wz.fangxiang);
				dt.dtkxl(dtk);
				Thread t2=new Thread(dt);
				t2.start();//����̹�������߳�
				Zidan zd=new Zidan(dt.x+10,dt.y+30,2);
				dt.dzd.add(zd);
				Thread t3=new Thread(zd);//���˷����ӵ��߳�
				t3.start();
				dtk.add(dt);			
			}
		}
		Shengyin sy=new Shengyin("./tank.wav");
		sy.start();
		tp1=Toolkit.getDefaultToolkit().getImage(("src/bzxg1.gif"));
		tp2=Toolkit.getDefaultToolkit().getImage(("src/bzxg2.gif"));
		tp3=Toolkit.getDefaultToolkit().getImage(("src/bzxg3.gif"));

	}
	//������̹���������ٷ���
	public void tjsl(Graphics g) {
		this.drawTank(80, 330, g, 0, 0);
		g.setColor(Color.black);
		g.drawString(Jilu.getMtsl()+"", 116, 350);
		this.drawTank(150, 330, g, 0, 1);
		g.setColor(Color.black);
		g.drawString(Jilu.getDtsl()+"", 186, 350);
		
		this.drawTank(450, 86, g, 0, 1);
		g.setColor(Color.black);
		g.drawString(Jilu.getSdtj()+"", 486, 107);
		g.setColor(Color.BLACK);
		Font f=new Font("���Ĳ���",Font.BOLD,20);
		g.setFont(f);
		g.drawString("�������̹������", 410, 40);
	}
	public void paint(Graphics g) {
		
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		this.tjsl(g);
		//���ҵ�̹��
		if(mt.shengming) {
			this.drawTank(mt.getX(),mt.getY(),g,mt.fangxiang,0);
		}
		//�����˵�̹�� 3��
		for(int i=0;i<dtk.size();i++) {
			DiTank dt=dtk.get(i);
			if(dt.shengming) {
				this.drawTank(dtk.get(i).getX(),dtk.get(i).getY(),g,dt.fangxiang,1);
				for(int j=0;j<dt.dzd.size();j++) {		
					
					Zidan dtzd=dt.dzd.get(j);//ÿ������װһ���ӵ�
					if(dtzd!=null && dtzd.shengming==true) {
						g.setColor(Color.white);
						g.fill3DRect(dtzd.x, dtzd.y, 3, 3, false);
					}
					if(dtzd.shengming==false) {//�ӵ���ǽ �����ɾ��
						dt.dzd.remove(dtzd);	
					}
				}
			}
		}
		//���ҵ�̹���ӵ�
		for(int i=0;i<mt.aa.size();i++) {
			Zidan zd=mt.aa.get(i);//ÿ������װһ���ӵ�
			if(mt.zd!=null && mt.zd.shengming==true) {
				g.setColor(Color.white);
				g.fill3DRect(zd.x, zd.y, 3, 3, false);
			}
			if(zd.shengming==false) {//�ӵ���ǽ �����ɾ��
				mt.aa.remove(zd);	
			}
		}
/*		//������̹���ӵ�  �Ѿ��ŵ�������̹��ѭ������
		for(int i=0;i<dt.dzd.size();i++) {		
			//DiTank dt=dtk.get(i);
			Zidan dtzd=dt.dzd.get(i);//ÿ������װһ���ӵ�
			if(dtzd!=null && dtzd.shengming==true) {
				g.setColor(Color.white);
				g.fill3DRect(dtzd.x, dtzd.y, 3, 3, false);
			}
			if(dtzd.shengming==false) {//�ӵ���ǽ �����ɾ��
				dt.dzd.remove(dtzd);	
			}
		}*/
		//����ը��
	for(int i=0;i<bzjh.size();i++) {
		
		Baozha bz=bzjh.get(i);
		if(bz.shengcunqi>6) {
			g.drawImage(tp1, bz.x, bz.y, 30, 30, this);			
		}else if(bz.shengcunqi>3) {
			g.drawImage(tp2, bz.x, bz.y, 30, 30, this);
		}else {
			g.drawImage(tp3, bz.x, bz.y, 30, 30, this);
		}
		bz.suqsd();
		if(bz.shengcunqi==0) {
			bzjh.remove(bz);
		}
	}
	
}
	//�����ҷ�̹�˵ķ���
	public void jzwf() {
		for(int i=0;i<this.dtk.size();i++) {//������̹��һ����ȡ����
			DiTank dt=dtk.get(i);
			for(int j=0;j<dt.dzd.size();j++) {//�������ӵ�һ����ȡ������2�߽��бȽ�
				Zidan zd=dt.dzd.get(j);
				if(mt.shengming) {
					this.jzdf(zd, mt);
				}
			}
			this.repaint();
		}
	}
	//���е���̹�˷���
	public void jzdf1() {
		for(int i=0;i<mt.aa.size();i++) {//ÿȡ��һ���ӵ�
			Zidan zd=mt.aa.get(i);
			if(zd.shengming) {
				for(int j=0;j<dtk.size();j++) {//ÿȡ��һ������̹��
					DiTank dt=dtk.get(i);
					if(dt.shengming) {
						if(this.jzdf(zd, dt)) {//b2ֵΪ�� 
							Jilu.dtjs();
							Jilu.sdsl();
						}
					}					
				}	
			}
			this.repaint();
		}
	}
	//�ӵ����е���̹�˷� �� ����Ϊ����˫��̹�˵ķ���
		public boolean jzdf(Zidan zd,Tank dt) {//��̬ ��������ָ���������
			//�ӵ����ֵ��ҵ� ���� 
			DiTank dt1;
			boolean b2=false;
			switch(dt.fangxiang) {
			case 0:
			case 2:
				if(zd.x>dt.x && zd.x<dt.x+20 && zd.y>dt.y && zd.y<dt.y+30)
				{
					Baozha bz=new Baozha(dt.x,dt.y);//��Ҫ����ըͼ����x,y����ֵ
					bzjh.add(bz);
					zd.shengming=false;
					dt.shengming=false;
					b2=true;
				/*if(dt instanceof DiTank) {//�жϵ�ǰ����Ķ����������ĸ���ģ�Ȼ��ִ�в���
					Jilu.dtjs();
					Jilu.sdsl();
					}*/					
				}
				break;
			case 1:
			case 3:
				if(zd.x>dt.x && zd.x<dt.x+30 && zd.y>dt.y && zd.y<dt.y+20)
				{
					Baozha bz=new Baozha(dt.x,dt.y);
					bzjh.add(bz);
					zd.shengming=false;
					dt.shengming=false;	
					b2=true;
					//if(dt instanceof DiTank) {Jilu.dtjs();Jilu.sdsl();}
				}			
			}
			return b2;
		}
	

	public void drawTank(int x, int y, Graphics g, int fangxiang, int leixing) {
		switch(leixing) {
		case 0://�ҵ�̹�� ��ɫ
			g.setColor(Color.yellow);
			break;
		case 1://���˵�̹�� ��ɫ
			g.setColor(Color.green);
		}
		switch(fangxiang) {
		case 0://��
			g.fill3DRect(x, y, 5, 30, false);//��ߵľ���
			g.fill3DRect(x+15, y, 5, 30, false);//�ұߵľ���
			g.fill3DRect(x+5, y+5, 10, 20, false);//�м�ľ���
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y-3);
			break;
		case 1://��
			g.fill3DRect(x, y, 30, 5, false);//��ߵľ���
			g.fill3DRect(x, y+15, 30, 5, false);//�ұߵľ���
			g.fill3DRect(x+5, y+5, 20, 10, false);//�м�ľ���
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x-3, y+10);
			break;
		case 2://��
			g.fill3DRect(x, y, 5, 30, false);//��ߵľ���
			g.fill3DRect(x+15, y, 5, 30, false);//�ұߵľ���
			g.fill3DRect(x+5, y+5, 10, 20, false);//�м�ľ���
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y+33);
			break;
		case 3://��
			g.fill3DRect(x, y, 30, 5, false);//��ߵľ���
			g.fill3DRect(x, y+15, 30, 5, false);//�ұߵľ���
			g.fill3DRect(x+5, y+5, 20, 10, false);//�м�ľ���
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x+33, y+10);
			break;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_W) {
			this.mt.setFangxiang(0);
			mt.xiangshang();
		}else if(e.getKeyCode()==KeyEvent.VK_A){
			this.mt.setFangxiang(1);
			mt.xiangzuo();
		}else if(e.getKeyCode()==KeyEvent.VK_S){
			this.mt.setFangxiang(2);
			mt.xiangxia();
		}else if(e.getKeyCode()==KeyEvent.VK_D){
			this.mt.setFangxiang(3);
			mt.xiangyou();
		}
		if(e.getKeyCode()==KeyEvent.VK_J) {
			if(mt.aa.size()<3) {//�����ӵ���Ϊ8��
				this.mt.fszd();
			}			
		}
		this.repaint();
	}
	
	@Override
/*	public void run() {
		while(true) {
			try {
				Thread.sleep(100);//����������Դ ��100ms�ػ���
			} catch (Exception e) {}
			//�ӵ���̹���������ײ
			for(int i=0;i<mt.aa.size();i++) {
				//����ѭ����Ŀ��ÿ���ӵ���ÿ������̹����ײ
				Zidan zd=mt.aa.get(i);
				if(zd.shengming) {
					for(int j=0;j<dtk.size();j++) {
						DiTank dt=dtk.get(j);
						if(dt.shengming) {							
							this.jzdf(zd,dt);								
						}
					}
				}
				this.repaint();
			}
	// ��Ϊ�з�̹��û���߳����Զ������ػ棬
//�������Mypanel��run�����ж��ӵ���̹�˵��Ǹ��߳�this.repaint����������һ��ѭ���ټ�һ��this.repaint����
			this.repaint();
		}
	
	}//run()
*/
	public void run() {//��10�κ�ֱ����MyPanel�߳�����÷���
		while(true) {
			try {
				Thread.sleep(100);//����������Դ ��100ms�ػ���
			} catch (Exception e) {}
			this.jzdf1();
			this.jzwf();
			this.repaint();
		}
	}
}
