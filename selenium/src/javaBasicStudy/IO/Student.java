/**
 * 
 */
package com.javaBasicStudy.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 * @author Administrator
 *使用BufferedWriter类的write()时  数据没有立刻被写入到输出流中 而是首先进入缓存区中
 */
public class Student {
	public static void main(String[] args) {
		String content[]={"明日科技","java部","快速入门"};
		File file=new File("D:/work","test.txt");
		
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bufw=new BufferedWriter(fw);
			for(int k=0;k<content.length;k++){
				bufw.write(content[k]);
				bufw.newLine();//将数组中的元素以单行的形式写入文件

			}
			bufw.close();
			fw.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		try {
			FileReader fr=new FileReader(file);
			BufferedReader bufr=new BufferedReader(fr);
			String s=null;
			int i=0;
			while((s=bufr.readLine())!=null){
				i++;
				System.out.println("第"+i+"行："+s);
			}
			
			bufr.close();
			fr.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
