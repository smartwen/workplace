package ZipFileDemo;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
 * ���ļ���ѹ
 * getNextEntry()
          ��ȡ��һ�� ZIP �ļ���Ŀ��������λ������Ŀ���ݵĿ�ʼ����
 */
public class UnzipFileDemo {
	public static void main(String[] args) {
		//Ҫ��ѹ���ļ�
		File zipFile=new File("c:"+File.separator+"haha.zip");
		//��ѹ���Ŀ¼
		File dir=new File("c:"+File.separator+"unzip_haha");			
		ZipInputStream zin=null;	
		OutputStream out=null;
		try {
			if(!dir.exists()){
				dir.mkdir();
			}
			zin=new ZipInputStream(new FileInputStream(zipFile));//ʵ�л�Ҫ��ѹ���ļ�
			ZipEntry entry=null;//ѹ��ʵ�����
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
	

