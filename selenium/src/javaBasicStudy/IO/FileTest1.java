package com.javaBasicStudy.IO;
import java.io.*;
public class FileTest1 {
	public static void main(String[] args) {
		//���췽�����ݸ�����·���� ����·���ַ���
		File file=new File("D:/work","test.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ��ѱ�ɾ��");
		}else{
			try {
				file.createNewFile();
				System.out.println("�ļ��ѱ��½�");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		}
		
	}
}
