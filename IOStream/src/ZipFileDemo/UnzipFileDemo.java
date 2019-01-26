package ZipFileDemo;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
 * 将文件解压
 * getNextEntry()
          读取下一个 ZIP 文件条目并将流定位到该条目数据的开始处。
 */
public class UnzipFileDemo {
	public static void main(String[] args) {
		//要解压的文件
		File zipFile=new File("c:"+File.separator+"haha.zip");
		//解压后的目录
		File dir=new File("c:"+File.separator+"unzip_haha");			
		ZipInputStream zin=null;	
		OutputStream out=null;
		try {
			if(!dir.exists()){
				dir.mkdir();
			}
			zin=new ZipInputStream(new FileInputStream(zipFile));//实列化要解压的文件
			ZipEntry entry=null;//压缩实体对象
			while((entry=zin.getNextEntry())!=null)
			{
				out=new FileOutputStream(new File(dir,entry.getName()));
				int temp=0;
				while((temp=zin.read())!=-1)
				{
					out.write(temp);
				}
				out.close();
			}
			}
		catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				zin.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
	}
	

