package com.javaBasicStudy.IO;
import java.io.*;
/**
 * @author Administrator
 *ʹ��FileOutputStream�����ļ�workд����Ϣ,Ȼ��ͬFileInputStream��
 *��work�ļ��е����ݶ�ȡ������̨��
 */

public class FileStream {

	public static void main(String[] args) {
		File file=new File("D:/work","test.txt");
		
		try {
			FileOutputStream out=new FileOutputStream(file);
			byte buy[]="���տƼ� JAVA��".getBytes();
			out.write(buy);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		try {
			FileInputStream in=new FileInputStream(file);
			byte byt[]=new byte[1024];
			int len=in.read(byt);
			System.out.println("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len));
			in.close();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	private int read(byte[] byt) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	private void close() {
		// TODO �Զ����ɵķ������
		
	}

}



