package ByteStreamDemo;

import java.io.*;

/*
 * ʹ���ļ�������С����
 */
public class FileCopyDemo {
	public static void main(String[] args) {
		OutputStream out = null ;
		InputStream in = null;
		FileOutputStream fout = null ;
		FileInputStream fin = null;
		File src=new File("c:"+File.separator+"haha"+File.separator+"hehe"+File.separator+"src.jpg");
		File des=new File("c:"+File.separator+"haha"+File.separator+"hehe"+File.separator+"des.jpg");
		try {
			in=new FileInputStream(src);
			out=new FileOutputStream(des);
			//��ȡԴ�ļ�
			byte[] buff=new byte[1024];//������
			while(in.read(buff)!=-1)//�ж��Ƿ�����ļ�β��
			{
				out.write(buff);
			}
		}catch (IOException e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
