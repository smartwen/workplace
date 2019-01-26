package ByteStreamDemo;

import java.io.*;

//使用文件流把唐诗写入文本文件当中
public class FileStreamDemo {
	
	public static void main(String[] args) {
		OutputStream out = null ;
		InputStream in = null;
		String s="床前明月光\r\n疑是地上霜\r\n举头望明月\r\n低头思故乡";
		
		File file=new File("c:"+File.separator+"test.txt");
		try {
			out=new FileOutputStream(file);
			byte[] b=s.getBytes();
			out.write(b);
			
			in=new FileInputStream(file);
			//写完后进行读取
			byte[] buff=new byte[(int) file.length()];
			in.read(buff);//把文件读入缓冲区
			String temp=new String(buff);
			System.out.println(temp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally
		{
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
