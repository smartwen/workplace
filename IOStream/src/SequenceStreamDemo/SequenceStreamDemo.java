package SequenceStreamDemo;

import java.io.*;

/*
 * java合并流案例
 * SequenceInputStream(InputStream s1, InputStream s2)
 */
public class SequenceStreamDemo {
	
	//合并文件的方法 如同管道流
	@SuppressWarnings("resource")
	public static  SequenceInputStream mergeFiles(SequenceInputStream sin,File f) throws FileNotFoundException
	{
		sin=new SequenceInputStream(sin,new FileInputStream(f));
		return sin;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SequenceInputStream sin=null;
		FileOutputStream fout=null;
		File a=new File("c:"+File.separator+"a.txt");
		File b=new File("c:"+File.separator+"b.txt");
		File c=new File("c:"+File.separator+"c.txt");
		File d=new File("c:"+File.separator+"d.txt");
		try {
			fout=new FileOutputStream(new File("c:"+File.separator+"abcd.txt"));
			sin=new SequenceInputStream(new FileInputStream(a),new FileInputStream(b));
			sin=SequenceStreamDemo.mergeFiles(sin, c);
			sin=SequenceStreamDemo.mergeFiles(sin, d);
			int temp=0;
			while((temp=sin.read())!=-1)
			{
				fout.write(temp);
			}
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//fout.close();
				sin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	}
}
