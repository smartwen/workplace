/**
 * 
 */
package com.javaBasicStudy.IO;

/**
 * @author Administrator
 *ZIP压缩输入输出流
 */
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class Myzip {
	private void zip(String zipFileName,File inputFile) throws Exception{
		ZipOutputStream out=new ZipOutputStream(new FileOutputStream(zipFileName));
		//调用方法 
		zip(out,inputFile,"");
		System.out.println("压缩中");
		out.close();
	}
	
	private void zip(ZipOutputStream out,File f,String base) throws Exception{
		if(f.isDirectory()){
			File[] fl=f.listFiles();//获取路径数组
			out.putNextEntry(new ZipEntry(base + "/"));//写入此目录的entry
			base=base.length() ==0 ? "": base +"/"; //判断此参数是否为空
			for(int i=0;i<fl.length;i++){
				zip(out,fl[i],base +fl[i]);
			}
		}else{
			out.putNextEntry(new ZipEntry(base));//new 新的进入点
			FileInputStream in=new FileInputStream(f);
			int b;
			System.out.println(base);
			while((b=in.read())!=-1){
				out.write(b); //将字节写入当前zip条目
			}
			in.close();
		}
	}
	
	public static void main(String[] args) {
		Myzip book=new Myzip();
		try {
			book.zip("D:/work.zip", new File("D:/work"));
			System.out.println("压缩完成");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
