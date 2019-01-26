package ByteStreamDemo;

import java.io.*;

/*
 * ʹ�û����������ļ��Ŀ���
 */
public class BufferStreamDemo {
	public static void main(String[] args) {
		OutputStream out = null ;
		InputStream in = null;
		BufferedOutputStream bout = null ;
		BufferedInputStream bin = null;
		File src=new File("c:"+File.separator+"haha"+File.separator+"hehe"+File.separator+"src.jpg");
		File des=new File("c:"+File.separator+"haha"+File.separator+"hehe"+File.separator+"des.jpg");
		try {
			bin=new BufferedInputStream(new FileInputStream(src));
			bout=new BufferedOutputStream(new FileOutputStream(des));
			//��ȡԴ�ļ�
			byte[] buff=new byte[1024];//������
			while(bin.read(buff)!=-1)//�ж��Ƿ�����ļ�β��
			{
				bout.write(buff);
			}
		}catch (IOException e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				bin.close();
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
