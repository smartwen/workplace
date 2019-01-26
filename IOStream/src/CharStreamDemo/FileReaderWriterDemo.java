package CharStreamDemo;
//文件字符流默认是使用缓冲区  w.flush()  只能读写字符
import java.io.*;
import java.nio.CharBuffer;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		Writer w = null ;
		Reader r = null;
		String s="床前明月光\r\n疑是地上霜\r\n举头望明月\r\n低头思故乡";
		
		File file=new File("c:"+File.separator+"test.txt");
		try {
			w=new FileWriter(file);
			w.write(s.toCharArray());
			//w.close();
			w.flush();
			
			r=new FileReader(file);
			//写完后进行读取
			char[] buff=new char[(int) file.length()];
			r.read(buff);//把文件读入缓冲区
			String temp=new String(buff);
			System.out.println(temp);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
