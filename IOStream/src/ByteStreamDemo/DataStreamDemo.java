package ByteStreamDemo;
/*
 * ʹ�����������������ݵĴ���
 */
import java.io.*;

public class DataStreamDemo {
	public static void main(String[] args) {
		File file=new File("c:"+File.separator+"test.txt");
		DataOutputStream dout=null;
		DataInputStream din=null;
		try {
		 dout=new DataOutputStream(new FileOutputStream(file));
		 din=new DataInputStream(new FileInputStream(file));
		 
		 //д��java����������
		 dout.writeInt(1000);
		 dout.writeChars("ţ");
		 dout.writeDouble(3.1415);
		 dout.writeBoolean(true);
		 
		// din.read();
		 //������˳���д��ı���һ��
		 System.out.println(din.readInt());
		 System.out.println(din.readChar());
		 System.out.println(din.readDouble());
		 System.out.println(din.readBoolean());
		 
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				dout.close();
				din.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
