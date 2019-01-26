/**
 * 
 */
package SerializeableDemo;

import java.io.*;
import java.util.Date;

/**
 * @author ��һ��������л�
 *
 */
public class SerializeableDemo2 {
	private File dest;
	private ObjectInputStream in;
	private ObjectOutputStream out;
	public SerializeableDemo2(File dest)
	{
		this.dest=dest;
		try {
			in=new ObjectInputStream(new FileInputStream(this.dest));
			out=new ObjectOutputStream(new FileOutputStream(this.dest));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void readObjects() throws ClassNotFoundException, IOException
	{
		Users[] users =(Users[])( this.in).readObject();
		for(Users u:users)
		{
			System.out.println(u);
		}
	}
	public void writeObjects(Object[] objs) {
		try {
			this.out.writeObject(objs);
			this.out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public File getDest() {
		return dest;
	}
	public void setDest(File dest) {
		this.dest = dest;
	}
	
	public static void main(String[] args) {
		Users[] users= {
				new Users("������","123456",1000,88.2,new Date()),
				new Users("������2","123456",1000,88.2,new Date()),
				new Users("������3","123456",1000,88.2,new Date()),
				new Users("������4","123456",1000,88.2,new Date()),
				new Users("������5","123456",1000,88.2,new Date()),

		};
		File dest=new File("c:"+File.separator+"Users.dat");
		SerializeableDemo2 sd=new SerializeableDemo2(dest);
		//���л���������
		sd.writeObjects(users);
		//�����л���������
		try {
			sd.readObjects();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
