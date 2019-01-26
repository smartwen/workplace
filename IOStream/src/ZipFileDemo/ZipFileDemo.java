package ZipFileDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/*
 * ѹ���ļ���     ���ļ�����ѹ��
 */
public class ZipFileDemo {
	public static void main(String[] args) {
		//String fileName="c:"+File.separator+"haha";
		//Ҫѹ�����ļ�
		File dir=new File("c:"+File.separator+"haha");
		//ѹ������ļ�
		File zipFile=new File("c:"+File.separator+"haha.zip");
		
		ZipOutputStream zout=null;
		InputStream in=null;
		
		try {//ʵ�л�ѹ���������
			zout=new ZipOutputStream(new FileOutputStream(zipFile));
			
			zout.setComment("zip file Stream");
			File[] files=dir.listFiles();
			//����Ŀ¼ �ļ���ȡ����
			for(int i=0;i<files.length;i++)
			{//��ȡÿ����Ҫѹ�����ļ�
				in=new FileInputStream(files[i]);
				//����ѹ��ʵ��
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
