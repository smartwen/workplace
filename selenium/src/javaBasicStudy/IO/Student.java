/**
 * 
 */
package com.javaBasicStudy.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
/**
 * @author Administrator
 *ʹ��BufferedWriter���write()ʱ  ����û�����̱�д�뵽������� �������Ƚ��뻺������
 */
public class Student {
	public static void main(String[] args) {
		String content[]={"���տƼ�","java��","��������"};
		File file=new File("D:/work","test.txt");
		
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bufw=new BufferedWriter(fw);
			for(int k=0;k<content.length;k++){
				bufw.write(content[k]);
				bufw.newLine();//�������е�Ԫ���Ե��е���ʽд���ļ�

			}
			bufw.close();
			fw.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		try {
			FileReader fr=new FileReader(file);
			BufferedReader bufr=new BufferedReader(fr);
			String s=null;
			int i=0;
			while((s=bufr.readLine())!=null){
				i++;
				System.out.println("��"+i+"�У�"+s);
			}
			
			bufr.close();
			fr.close();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
