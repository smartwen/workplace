/**
 * 
 */
package com.javaBasicStudy.IO;

/**
 * @author Administrator
 *解压文件
 */
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.openqa.selenium.io.Zip;

public class Decompressing {
	public static void main(String[] args) {
		ZipInputStream zin;
		
		try {
			zin=new ZipInputStream(new FileInputStream("D:/work.zip"));
			ZipEntry entry=zin.getNextEntry();
			while(((entry=zin.getNextEntry())!=null) && !entry.isDirectory()){
			File file=new File(entry.getName());
			if(!file.exists()){
				file.createNewFile();
			}
			zin.closeEntry();
			System.out.println(entry.getTime()+"解压完成");
			}
			zin.close();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
