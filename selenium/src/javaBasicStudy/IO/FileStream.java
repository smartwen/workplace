package com.javaBasicStudy.IO;
import java.io.*;
/**
 * @author Administrator
 *使用FileOutputStream类向文件work写入信息,然后同FileInputStream类
 *将work文件中的数据读取到控制台上
 */

public class FileStream {

	public static void main(String[] args) {
		File file=new File("D:/work","test.txt");
		
		try {
			FileOutputStream out=new FileOutputStream(file);
			byte buy[]="明日科技 JAVA部".getBytes();
			out.write(buy);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			FileInputStream in=new FileInputStream(file);
			byte byt[]=new byte[1024];
			int len=in.read(byt);
			System.out.println("文件中的信息是："+new String(byt,0,len));
			in.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	private int read(byte[] byt) {
		// TODO 自动生成的方法存根
		return 0;
	}

	private void close() {
		// TODO 自动生成的方法存根
		
	}

}



