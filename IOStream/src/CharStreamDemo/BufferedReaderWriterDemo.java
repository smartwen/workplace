package CharStreamDemo;

import java.io.*;

//使用带缓冲的字符流实现电子书文件的拷贝
public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		BufferedWriter bw = null ;
		BufferedReader br = null;
		//String s="床前明月光\r\n疑是地上霜\r\n举头望明月\r\n低头思故乡";
		
		File src=new File("c:"+File.separator+"test.txt");
		File des=new File("c:"+File.separator+"des.txt");		
		try {
	
			br=new BufferedReader(new FileReader(src));
			bw=new BufferedWriter(new FileWriter(des));
			char[] temp=new char[10];
			while((br.read(temp))!=-1)
			{
				bw.write(temp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
