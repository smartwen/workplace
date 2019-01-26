package ZipFileDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/*
 * 压缩文件流     将文件进行压缩
 */
public class ZipFileDemo {
	public static void main(String[] args) {
		//String fileName="c:"+File.separator+"haha";
		//要压缩的文件
		File dir=new File("c:"+File.separator+"haha");
		//压缩后的文件
		File zipFile=new File("c:"+File.separator+"haha.zip");
		
		ZipOutputStream zout=null;
		InputStream in=null;
		
		try {//实列化压缩输出对象
			zout=new ZipOutputStream(new FileOutputStream(zipFile));
			
			zout.setComment("zip file Stream");
			File[] files=dir.listFiles();
			//遍历目录 文件提取出来
			for(int i=0;i<files.length;i++)
			{//读取每个需要压缩的文件
				in=new FileInputStream(files[i]);
				//生成压缩实体
				zout.putNextEntry(new ZipEntry(files[i].getName()));
				int temp=0;
				while((temp=in.read())!=-1)
				{
					zout.write(temp);
				}
				in.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				zout.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
