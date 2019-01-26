package ByteStreamDemo;

import java.io.*;

/*
 * 使用文件拷贝的小案例
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
			//读取源文件
			byte[] buff=new byte[1024];//缓冲区
			while(in.read(buff)!=-1)//判断是否读到文件尾部
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
