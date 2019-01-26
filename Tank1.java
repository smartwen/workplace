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
 *包含主方法, MyPanel面板绘制我的坦克
 *2.画黄色坦克
 *lession3.画四个方向的坦克
 *4.坦克动起来+绘制3个敌人坦克
 *5.绘制子弹，子弹做成线程类
 *6.子弹连发，安排子弹只在画布中活动
 *7.限制子弹连发数在 KeyEvent.VK_J，子弹打中坦克方法 2层for循环
 *8.放入爆炸类图片 myPanel()新建图片对象，在原材料里新建爆炸类，在paint()里画爆炸效果，图片是和包同一级目录
 *9.敌人坦克动起来 做成线程类,难点自动调用重绘
 *10.敌人坦克围着屏幕转，敌人坦克发射子弹 在画坦克时 画敌人子弹
 *11.敌人坦克不能互相碰撞 
 *12.制作开始游戏时的关卡显示面板
 *13.绘制新游戏菜单 开始我的面板    在原材料类新建Jilu类 定义静态方法敌人数量减少，然后在击中双方方法里调用
 *MyPanel里有tjsl()画出来 敌我坦克数量减少 显示在面板
 *14.每次开启游戏时，自动获得上次打死坦克数量  在右上面板显示
 *15.存盘退出 在记录类新建2个方法 MyPanel()里调用读取记录方法
 *16.新建存盘退出方法  新建位置类
 *17.Jilu类新建读盘方法  MyPanel()修改构造方法 增加if else判断
 *18.加上出场声音
 */
public class Tank1 extends JFrame implements ActionListener{
	private MyPanel mp=null;
	private GuangkaPanel gkmp=null;
	private JMenuBar jmenuBar;
	private JMenu cd1;
	private JMenuItem cdx1,cdx2,cdx3,cdx4;
	public Tank1() {
		jmenuBar=new JMenuBar();
		cd1=new JMenu("游戏(G)");
		cd1.setMnemonic('G');
		cdx1=new JMenuItem("新游戏(N)");
		cdx2=new JMenuItem("退出游戏(E)");
		cdx3=new JMenuItem("存盘退出(C)");
		cdx4=new JMenuItem("继续游戏(S)");
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
		this.setTitle("刘文的坦克大战");
	}
	public static void main(String[] args) {
		Tank1 t1=new Tank1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("newGame"))//新游戏事件
		{
			mp=new MyPanel("newGame");
			this.remove(gkmp);
			this.add(mp);
			this.addKeyListener(mp);
			Thread t=new Thread(mp);
			t.start();
			this.setVisible(true);
		}
		else if(e.getActionCommand().equals("goonGame"))//继续游戏
		{
			//封装
			mp=new MyPanel("goonGame");		
			Thread t=new Thread(mp);
			t.start();
			this.remove(gkmp);
			this.add(mp);		
			this.addKeyListener(mp);
			this.setVisible(true);
		}
		else if(e.getActionCommand().equals("saveExit"))//保存退出
		{
			Jilu jl=new Jilu();
			jl.setDtk(mp.dtk);//设置下敌人坦克的面板
			jl.cunpan();
			System.exit(0);
		}
		else if(e.getActionCommand().equals("exit"))//直接退出游戏
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
		if(times%2==0) {//画关卡面板,时间出现闪烁的效果
			g.setColor(Color.yellow);
			Font myFont=new Font("华文行楷",Font.BOLD,38);
			g.setFont(myFont);
			g.drawString("第1关", 140, 140);
		}
}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(600);//间隔多少出现闪烁
			} catch (Exception e) {e.printStackTrace();}
			times++;
			this.repaint();
		}
	}	
}
/**
 * @author Administrator
 *面板绘制坦克
 */
class MyPanel extends JPanel implements KeyListener, Runnable{

	 MyTank mt=null;
	 DiTank dt=null;
	//敌人坦克多线程 使用vector集合  坦克组 向量
	Vector<DiTank> dtk=new Vector<DiTank>();
	Vector<Baozha> bzjh=new Vector<Baozha>();	
	static Vector<Weizhi> wzjh=new Vector<Weizhi>();

	int tksl=3;
	//爆炸也需要做向量，有3张图片
	Image tp1=null;
	Image tp2=null;
	Image tp3=null;
	
	public MyPanel(String ss) {
		//第一个读取硬盘数据
		Jilu.dqjl();
		mt=new MyTank(140,232);
		if(ss=="newGame") {			
			for(int i=0;i<tksl;i++) {
				 dt=new DiTank((i)*180+5, 0);
				dt.setFangxiang(2);
				Thread t2=new Thread(dt);
				t2.start();//敌人坦克启动线程
				Zidan zd=new Zidan(dt.x+10,dt.y+30,2);
				dt.dzd.add(zd);
				Thread t3=new Thread(zd);//敌人发射子弹线程
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
				t2.start();//敌人坦克启动线程
				Zidan zd=new Zidan(dt.x+10,dt.y+30,2);
				dt.dzd.add(zd);
				Thread t3=new Thread(zd);//敌人发射子弹线程
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
	//画敌我坦克数量减少方法
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
		Font f=new Font("华文彩云",Font.BOLD,20);
		g.setFont(f);
		g.drawString("你消灭的坦克总数", 410, 40);
	}
	public void paint(Graphics g) {
		
		super.paint(g);
		g.fillRect(0, 0, 400, 300);
		this.tjsl(g);
		//画我的坦克
		if(mt.shengming) {
			this.drawTank(mt.getX(),mt.getY(),g,mt.fangxiang,0);
		}
		//画敌人的坦克 3辆
		for(int i=0;i<dtk.size();i++) {
			DiTank dt=dtk.get(i);
			if(dt.shengming) {
				this.drawTank(dtk.get(i).getX(),dtk.get(i).getY(),g,dt.fangxiang,1);
				for(int j=0;j<dt.dzd.size();j++) {		
					
					Zidan dtzd=dt.dzd.get(j);//每次往里装一颗子弹
					if(dtzd!=null && dtzd.shengming==true) {
						g.setColor(Color.white);
						g.fill3DRect(dtzd.x, dtzd.y, 3, 3, false);
					}
					if(dtzd.shengming==false) {//子弹碰墙 后进行删除
						dt.dzd.remove(dtzd);	
					}
				}
			}
		}
		//画我的坦克子弹
		for(int i=0;i<mt.aa.size();i++) {
			Zidan zd=mt.aa.get(i);//每次往里装一颗子弹
			if(mt.zd!=null && mt.zd.shengming==true) {
				g.setColor(Color.white);
				g.fill3DRect(zd.x, zd.y, 3, 3, false);
			}
			if(zd.shengming==false) {//子弹碰墙 后进行删除
				mt.aa.remove(zd);	
			}
		}
/*		//画敌人坦克子弹  已经放到画敌人坦克循环里了
		for(int i=0;i<dt.dzd.size();i++) {		
			//DiTank dt=dtk.get(i);
			Zidan dtzd=dt.dzd.get(i);//每次往里装一颗子弹
			if(dtzd!=null && dtzd.shengming==true) {
				g.setColor(Color.white);
				g.fill3DRect(dtzd.x, dtzd.y, 3, 3, false);
			}
			if(dtzd.shengming==false) {//子弹碰墙 后进行删除
				dt.dzd.remove(dtzd);	
			}
		}*/
		//画爆炸类
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
	//击中我方坦克的方法
	public void jzwf() {
		for(int i=0;i<this.dtk.size();i++) {//将敌人坦克一个个取出来
			DiTank dt=dtk.get(i);
			for(int j=0;j<dt.dzd.size();j++) {//将敌人子弹一个个取出来，2者进行比较
				Zidan zd=dt.dzd.get(j);
				if(mt.shengming) {
					this.jzdf(zd, mt);
				}
			}
			this.repaint();
		}
	}
	//击中敌人坦克方法
	public void jzdf1() {
		for(int i=0;i<mt.aa.size();i++) {//每取出一颗子弹
			Zidan zd=mt.aa.get(i);
			if(zd.shengming) {
				for(int j=0;j<dtk.size();j++) {//每取出一个敌人坦克
					DiTank dt=dtk.get(i);
					if(dt.shengming) {
						if(this.jzdf(zd, dt)) {//b2值为真 
							Jilu.dtjs();
							Jilu.sdsl();
						}
					}					
				}	
			}
			this.repaint();
		}
	}
	//子弹击中敌人坦克方 法 升级为击中双方坦克的方法
		public boolean jzdf(Zidan zd,Tank dt) {//多态 父类引用指向子类对象
			//子弹不分敌我的 这里 
			DiTank dt1;
			boolean b2=false;
			switch(dt.fangxiang) {
			case 0:
			case 2:
				if(zd.x>dt.x && zd.x<dt.x+20 && zd.y>dt.y && zd.y<dt.y+30)
				{
					Baozha bz=new Baozha(dt.x,dt.y);//需要给爆炸图传入x,y坐标值
					bzjh.add(bz);
					zd.shengming=false;
					dt.shengming=false;
					b2=true;
				/*if(dt instanceof DiTank) {//判断当前传入的对象是属于哪个类的，然后执行操作
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
		case 0://我的坦克 黄色
			g.setColor(Color.yellow);
			break;
		case 1://敌人的坦克 绿色
			g.setColor(Color.green);
		}
		switch(fangxiang) {
		case 0://上
			g.fill3DRect(x, y, 5, 30, false);//左边的矩形
			g.fill3DRect(x+15, y, 5, 30, false);//右边的矩形
			g.fill3DRect(x+5, y+5, 10, 20, false);//中间的矩形
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y-3);
			break;
		case 1://左
			g.fill3DRect(x, y, 30, 5, false);//左边的矩形
			g.fill3DRect(x, y+15, 30, 5, false);//右边的矩形
			g.fill3DRect(x+5, y+5, 20, 10, false);//中间的矩形
			g.fillOval(x+10, y+5, 10, 10);
			g.drawLine(x+15, y+10, x-3, y+10);
			break;
		case 2://下
			g.fill3DRect(x, y, 5, 30, false);//左边的矩形
			g.fill3DRect(x+15, y, 5, 30, false);//右边的矩形
			g.fill3DRect(x+5, y+5, 10, 20, false);//中间的矩形
			g.fillOval(x+5, y+10, 10, 10);
			g.drawLine(x+10, y+15, x+10, y+33);
			break;
		case 3://右
			g.fill3DRect(x, y, 30, 5, false);//左边的矩形
			g.fill3DRect(x, y+15, 30, 5, false);//右边的矩形
			g.fill3DRect(x+5, y+5, 20, 10, false);//中间的矩形
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
			if(mt.aa.size()<3) {//限制子弹数为8个
				this.mt.fszd();
			}			
		}
		this.repaint();
	}
	
	@Override
/*	public void run() {
		while(true) {
			try {
				Thread.sleep(100);//合理利用资源 隔100ms重绘制
			} catch (Exception e) {}
			//子弹和坦克在面板碰撞
			for(int i=0;i<mt.aa.size();i++) {
				//二层循环的目的每发子弹和每量敌人坦克碰撞
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
	// 因为敌方坦克没有线程来自动调用重绘，
//你可以在Mypanel的run方法判断子弹和坦克的那个线程this.repaint（）再外面一个循环再加一个this.repaint（）
			this.repaint();
		}
	
	}//run()
*/
	public void run() {//第10课后直接在MyPanel线程类调用方法
		while(true) {
			try {
				Thread.sleep(100);//合理利用资源 隔100ms重绘制
			} catch (Exception e) {}
			this.jzdf1();
			this.jzwf();
			this.repaint();
		}
	}
}
