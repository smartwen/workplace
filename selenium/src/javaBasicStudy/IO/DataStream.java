/**
 * 
 */
package com.javaBasicStudy.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 *数据输入流允许程序以与机器无关的方式从底层输入流中读取java数据类型
 *当读取一个数据时  不必关心这个数值是什么字节
 */
public class DataStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fs=new FileOutputStream("D:/work/test.txt");
			DataOutputStream dos=new DataOutputStream(fs);
			dos.writeChars("char");
			dos.writeUTF("UTF");
			dos.writeBytes("byte");
			dos.close();
			
			FileInputStream fi=new FileInputStream("D:/work/test.txt");
			DataInputStream di=new DataInputStream(fi);
			
			System.out.println(di.readUTF());
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
