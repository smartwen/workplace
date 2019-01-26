package com.javaBasicStudy.IO;
import java.io.*;
public class FileTest1 {
	public static void main(String[] args) {
		//构造方法依据父抽象路径名 和子路径字符串
		File file=new File("D:/work","test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("文件已被删除");
		}else{
			try {
				file.createNewFile();
				System.out.println("文件已被新建");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
		
	}
}
