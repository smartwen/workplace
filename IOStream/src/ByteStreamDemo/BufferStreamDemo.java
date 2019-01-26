package ByteStreamDemo;

import java.io.*;

/*
 * 使用缓冲流进行文件的拷贝
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
			//读取源文件
			byte[] buff=new byte[1024];//缓冲区
			while(bin.read(buff)!=-1)//判断是否读到文件尾部
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
