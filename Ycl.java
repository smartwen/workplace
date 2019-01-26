package Tank;

import java.io.*;
import java.util.Vector;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/**
 * 坦克类
 */ 
class Tank{
	boolean shengming=true;
	int x=0,y=0;
	int sudu=5;
	int fangxiang=0;
	int color;
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public Tank(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getSudu() {
		return sudu;
	}
	public void setSudu(int sudu) {
		this.sudu = sudu;
	}
	public int getFangxiang() {
		return fangxiang;
	}
	public void setFangxiang(int fangxiang) {
		this.fangxiang = fangxiang;
	}
}
/**
 * 敌人的坦克
*/
class DiTank extends Tank implements Runnable{
	int sudu=2;
	int time=0;
	Zidan zd=null;
	Vector<DiTank> dtk=new Vector<DiTank>();
	Vector<Zidan> dzd=new Vector<Zidan>();
	public DiTank(int x, int y) {
		super(x, y);
	}
	// ----把敌方的三个坦克的向量传过来，用来判断相撞的  将Tank1的MyPanel类的坦克集合传递过来的
	public void dtkxl(Vector<DiTank> dxl)
	{
		this.dtk=dxl;
	}
	//判断敌方坦克碰撞的方法
	public boolean huxiangpengzhuang()
	{
		boolean b=false;
		switch(this.fangxiang)
		{
		case 0:
			
			for(int i=0;i<dtk.size();i++)
			{
				DiTank dt=dtk.get(i);
				
				if(dt!=this)
				{
					if(dt.fangxiang==0||dt.fangxiang==2)
					{
						if(this.x>=dt.x && this.x<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30)
						{
							return true;
						}
						if(this.x+20>=dt.x && this.x+20<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30)
						{
							return true;
						}
					}
					if(dt.fangxiang==3||dt.fangxiang==1)
					{
						if(this.x>=dt.x && this.x<=dt.x+30 && this.y>=dt.y && this.y<=dt.y+20)
						{
							return true;
						}
						if(this.x+20>=dt.x && this.x+20<=dt.x+30 && this.y>=dt.y && this.y<=dt.y+20)
						{
							return true;
						}
					}
				}
			}
			break;
		case 1:
			for(int i=0;i<dtk.size();i++)
			{
				DiTank dt=dtk.get(i);
				if(dt!=this)
				{
				    if(dt.fangxiang==0||dt.fangxiang==2)
					{
						if(this.x>=dt.x&&this.x<=dt.x+20&&this.y>=dt.y&&this.y<=dt.y+30)
						{
							return true;
						}
						//下一点
						if(this.x>=dt.x&&this.x<=dt.x+20&&this.y+20>=dt.y&&this.y+20<=dt.y+30)
						{
							return true;
						}
					}
					if(dt.fangxiang==3||dt.fangxiang==1)
					{
						if(this.x>=dt.x&&this.x<=dt.x+30&&this.y>=dt.y&&this.y<=dt.y+20)
						{
							return true;
						}
						if(this.x>=dt.x&&this.x<=dt.x+30&&this.y+20>=dt.y&&this.y+20<=dt.y+20)
						{
							return true;
						}
					}
				}
			}
			
			
			break;
		case 2:
			for(int i=0;i<dtk.size();i++)
			{
				DiTank dt=dtk.get(i);
				if(dt!=this)
				{
					if(dt.fangxiang==0||dt.fangxiang==2)
					{
						if(this.x>=dt.x&&this.x<=dt.x+20&&this.y+30>=dt.y&&this.y+30<=dt.y+30)
						{
							return true;
						}
						if(this.x+20>=dt.x&&this.x+20<=dt.x+20&&this.y+30>=dt.y&&this.y+30<=dt.y+30)
						{
							return true;
						}
					}
					if(dt.fangxiang==3||dt.fangxiang==1)
					{
						if(this.x>=dt.x&&this.x<=dt.x+30&&this.y+30>=dt.y&&this.y+30<=dt.y+20)
						{
							return true;
						}
						
						if(this.x+20>=dt.x&&this.x+20<=dt.x+30&&this.y+30>=dt.y&&this.y+30<=dt.y+20)
						{
							return true;
						}
					}
				}
			}
			break;
		case 3:
			for(int i=0;i<dtk.size();i++)
			{
				DiTank dt=dtk.get(i);
				if(dt!=this)
				{
					if(dt.fangxiang==0||dt.fangxiang==2)
					{
						if(this.x+30>=dt.x && this.x+30<=dt.x+20 && this.y>=dt.y && this.y<=dt.y+30)
						{
							return true;
						}						
						if(this.x+30>=dt.x && this.x+30<=dt.x+20 && this.y+20>=dt.y && this.y+20<=dt.y+30)
						{
							return true;
						}
					}
					if(dt.fangxiang==3||dt.fangxiang==1)
					{
						if(this.x+30>=dt.x && this.x+30<=dt.x+30 && this.y>=dt.y && this.y<=dt.y+20)
						{
							return true;
						}
						if(this.x+30>=dt.x && this.x+30<=dt.x+30 && this.y+20>=dt.y && this.y+20<=dt.y+20)
						{
							return true;
						}
					}
				}
			}			
			break;
		}		
		return b;//编译器不知道for循环里的return 是否会执行，所以必须加
	}
	@Override
	public void run() {
		while(true) {
			
			switch(this.fangxiang) {
			case 0:
				for(int i=0;i<30;i++) {
					if(y>0 && !huxiangpengzhuang()) {
						y-=sudu;
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {e.printStackTrace();}
				}			
				break;
			case 1:
				for(int i=0;i<30;i++) {
					if(x>0 && !huxiangpengzhuang()) {
						x-=sudu;
					}				
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {e.printStackTrace();}
				}					
				break;
			case 2:
				for(int i=0;i<30;i++) {
					if(y<240 && !huxiangpengzhuang()) {y+=sudu;}				
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {e.printStackTrace();}
				}						
				break;
			case 3:
				for(int i=0;i<30;i++) {
					if(x<350 && !huxiangpengzhuang()) {x+=sudu;}					
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {e.printStackTrace();}
				}			
				break;
			}
			this.fangxiang=(int) (Math.random()*4);	
			if(this.shengming==false) {
				break;
			}
			this.time++;
			if(time%2==0) {//时间为偶数时发射
				if(this.shengming) {//敌人坦克有生命
					if(dzd.size()<5) {
						
						switch(this.fangxiang) {
						case 0:
							zd=new Zidan(x+10,y,0);
							//每发射一次添加一颗
							dzd.add(zd);
							break;		
						case 1:
							zd=new Zidan(x,y+10,1);
							dzd.add(zd);
							break;
						case 2:
							zd=new Zidan(x+10,y+30,2);
							dzd.add(zd);
							break;
						case 3:
							zd=new Zidan(x+30,y+10,3);
							dzd.add(zd);
							break;
					}
					Thread t5=new Thread(zd);
					t5.start();
					}
				}	
			}
		}
	}
}				
/**
 * 我的坦克类 在这里启动子弹的线程类
 *子弹是跟随坦克走的
 */
class MyTank extends Tank{
	
	Vector<Zidan> aa =new Vector<Zidan>();
	 Zidan zd=null;		
	//子弹跟随坦克对象,子弹是线程类
	public void fszd() {
		switch(this.fangxiang) {
		case 0:
			zd=new Zidan(x+10,y,0);
			//每发射一次添加一颗
			aa.add(zd);
			break;		
		case 1:
			zd=new Zidan(x,y+10,1);
			aa.add(zd);
			break;
		case 2:
			zd=new Zidan(x+10,y+30,2);
			aa.add(zd);
			break;
		case 3:
			zd=new Zidan(x+30,y+10,3);
			aa.add(zd);
			break;
		}
		Thread t=new Thread(zd);
		t.start();
	}
	
	
	public MyTank(int x, int y) {
		super(x, y);
	}	
	public void xiangshang() {
		if(y>0) {y-=sudu;}
		//y-=sudu;
	}
	public void xiangzuo() {
		if(x>0) {x-=sudu;}
		//x-=sudu;
	}
	public void xiangxia() {
		if(y<230) {y+=sudu;}
		y+=sudu;	
	}
	public void xiangyou() {
		if(x<350) {x+=sudu;}
		//x+=sudu;		
	}	
}

//子弹类
class Zidan implements Runnable{
	int x,y;
	int fangxiang;
	int sudu=5;
	boolean shengming=true;
	public Zidan(int x,int y,int fangxiang) {
		this.x=x;
		this.y=y;
		this.fangxiang=fangxiang;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(50);//线程的死循环例都有个睡眠
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			switch(fangxiang) {
			case 0://上
				y-=sudu;
				break;
			case 1:
				x-=sudu;
				break;
			case 2:
				y+=sudu;
				break;
			case 3://右
				x+=sudu;
				break;
			}//使子弹在画布里跑
			if(x<0||y<0||x>400||y>300) {
				this.shengming=false;
			}
		}
		
	}
	
}
//爆炸类
class Baozha{
	int x,y;
	int shengcunqi=10;
	boolean shengming=true;
	public Baozha(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void suqsd() {
		if(shengcunqi>0) {
			shengcunqi--;
		}else {
			this.shengming=false;
		}
	}
}
class Jilu{
	private static int dtsl=10;
	private static int mtsl=2;
	private static int sdtj=0;
	private static FileWriter fw=null;
	private static BufferedWriter bw=null;
	private  static FileReader fr=null;
	private static  BufferedReader br=null;
	private static Vector<DiTank> dtk=new Vector<DiTank>();
	static Vector<Weizhi> wzjh=new Vector<Weizhi>();
	public Vector<DiTank> getDtk() {
		return dtk;
	}
	public void setDtk(Vector<DiTank> dtk) {
		this.dtk = dtk;
	}
	
	public static int getDtsl() {//多线程做成静态的 为了安全
		return dtsl;
	}
	public static void setDtsl(int dtsl) {
		Jilu.dtsl = dtsl;
	}
	public static int getSdtj() {
		return sdtj;
	}
	public static void setSdtj(int sdtj) {
		Jilu.sdtj = sdtj;
	}
	public static int getMtsl() {
		return mtsl;
	}
	public static void setMtsl(int mtsl) {
		Jilu.mtsl = mtsl;
	}
	public static void dtjs() {
		dtsl--;
	}
	
	public static void mtjs() {
		mtsl--;
	}
	//新建杀敌数量方法
	public static void sdsl() {
		sdtj++;
	}
	public static void bcjl() {//保存杀敌统计到硬盘
		try {
			fw=new FileWriter("f:/TKDZ/cpj1.txt");
			bw=new BufferedWriter(fw);
			bw.write(sdtj+"\r\n");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//fw.flush();bw.flush();
				bw.close();
				fw.close();
				
			} catch (IOException e) {}			
			
			}
		}
	//从硬盘读取记录
	public static void dqjl() {
		try {
			fr=new FileReader("f:/TKDZ/cpj1.txt");
			br=new BufferedReader(fr);
			String str=br.readLine();
			sdtj=Integer.parseInt(str);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();fr.close();	
			} catch (IOException e) {}			}
	
		}
	//点击存盘退出方法
	public void cunpan() {
		try {
			fw=new FileWriter("f:/TKDZ/cpj1.txt");
			bw=new BufferedWriter(fw);
			bw.write(sdtj+"\r\n");
			for(int i=0;i<dtk.size();i++) {
				DiTank dt=dtk.get(i);
				if(dt.shengming) {
					String zb=dt.x+" "+dt.y+" "+dt.fangxiang+"";
					bw.write(zb+"\r\n");
				}
						
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//fw.flush();bw.flush();
				bw.close();
				fw.close();
				
			} catch (IOException e) {}			
			
			}
	}	
//读盘方法
	public static Vector<Weizhi> dupan(){
		try {
			fr=new FileReader("f:/TKDZ/cpj1.txt");
			br=new BufferedReader(fr);
			String s="";
			s=br.readLine();
			sdtj=Integer.parseInt(s);
			while((s=br.readLine())!=null)
			{
				String[] sz=s.split(" ");
				Weizhi wz=new Weizhi(Integer.parseInt(sz[0]),Integer.parseInt(sz[1]),Integer.parseInt(sz[2]));
				wzjh.add(wz);//将多辆坦克的位置加到集合中
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//fw.flush();bw.flush();
				br.close();
				fr.close();
				
			} catch (IOException e) {}			
			
			}
		return wzjh;
	}
}
class Weizhi{
	int x,y,fangxiang;
	public Weizhi(int x,int y,int fangxiang) {
		this.x=x;
		this.y=y;
		this.fangxiang=fangxiang;
	}
	
}
//音频类
class Shengyin extends Thread{
	private String wjm;
	public Shengyin(String ypwj)
	{
		 wjm=ypwj;
	}

	public void run() {

		File wjl = new File(wjm);

		AudioInputStream ypsrl = null;
		try {
			ypsrl = AudioSystem.getAudioInputStream(wjl);
		} catch (Exception e){}

		AudioFormat format = ypsrl.getFormat();
		SourceDataLine aqsj = null;
		DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

		try {
			aqsj = (SourceDataLine) AudioSystem.getLine(info);
			aqsj.open(format);
		} catch (Exception e){}		
		aqsj.start();
		
		int zjtj = 0;
		byte[] hczj = new byte[1024];
		try {
			while (zjtj  != -1) {
				zjtj = ypsrl.read(hczj, 0, hczj.length);
				if (zjtj  >= 0)
					aqsj.write(hczj, 0, zjtj );
			}
		} catch (Exception e){}
		finally {
			aqsj.drain();//将残留部分处理干净
			aqsj.close();
		}
	}	
}