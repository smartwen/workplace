/**
 * 
 */
package com.javaBasicStudy.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 *�������������������������޹صķ�ʽ�ӵײ��������ж�ȡjava��������
 *����ȡһ������ʱ  ���ع��������ֵ��ʲô�ֽ�
 */
public class DataStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fs=new FileOutputStream("D:/work/test.txt");
			DataOutputStream dos=new DataOutputStream(fs);
			dos.writeChars("char");
			dos.writeUTF("UTF");
			dos.writeBytes("byte");
			dos.close();
			
			FileInputStream fi=new FileInputStream("D:/work/test.txt");
			DataInputStream di=new DataInputStream(fi);
			
			System.out.println(di.readUTF());
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}
}
