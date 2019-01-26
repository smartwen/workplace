package SerializeableDemo;

import java.io.*;
import java.util.Date;

public class SerializeableDemo {
	public static void main(String[] args) {
		ObjectOutputStream oos=null;
		ObjectInputStream ois=null;
		String fileName="c:"+File.separator+"Users.dat";
		Users user=new Users("张三丰","123456",1000,88.2,new Date());
		try {
			oos=new ObjectOutputStream(new FileOutputStream(new File(fileName)));
			ois=new ObjectInputStream(new FileInputStream(new File(fileName)));
			//通过序列化写入对象
			oos.writeObject(user);
			//反序列化
			Users temp=(Users) ois.readObject();
			System.out.println(temp);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
