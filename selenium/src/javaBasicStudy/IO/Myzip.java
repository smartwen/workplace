/**
 * 
 */
package com.javaBasicStudy.IO;

/**
 * @author Administrator
 *ZIPѹ�����������
 */
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class Myzip {
	private void zip(String zipFileName,File inputFile) throws Exception{
		ZipOutputStream out=new ZipOutputStream(new FileOutputStream(zipFileName));
		//���÷��� 
		zip(out,inputFile,"");
		System.out.println("ѹ����");
		out.close();
	}
	
	private void zip(ZipOutputStream out,File f,String base) throws Exception{
		if(f.isDirectory()){
			File[] fl=f.listFiles();//��ȡ·������
			out.putNextEntry(new ZipEntry(base + "/"));//д���Ŀ¼��entry
			base=base.length() ==0 ? "": base +"/"; //�жϴ˲����Ƿ�Ϊ��
			for(int i=0;i<fl.length;i++){
				zip(out,fl[i],base +fl[i]);
			}
		}else{
			out.putNextEntry(new ZipEntry(base));//new �µĽ����
			FileInputStream in=new FileInputStream(f);
			int b;
			System.out.println(base);
			while((b=in.read())!=-1){
				out.write(b); //���ֽ�д�뵱ǰzip��Ŀ
			}
			in.close();
		}
	}
	
	public static void main(String[] args) {
		Myzip book=new Myzip();
		try {
			book.zip("D:/work.zip", new File("D:/work"));
			System.out.println("ѹ�����");
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
