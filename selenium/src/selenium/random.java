/**
4.20����������֤��
���������֤��ķ�ʽ�ǳ��򵥣�ֻ����û���������Ϣ���һ���߼��ж�
 * 
 */
package selenium;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int min=1000;
		int max=9999;
		Random rand=new Random();
		int s=rand.nextInt(max)%(max-min+1)+min;
		String ss=String.valueOf(s);
		System.out.println(ss);
		
		//�����������
		Scanner sc=new Scanner(System.in);
		//��ȡ�û�������ַ���
		System.out.print("�����������֤�룺");
		String str=sc.nextLine();
		
		if(str.equals(ss)){
			System.out.println("������ȷ");
		}else if(str.equals("98165454")){
			System.out.print("������ȷ");
		}else{
			System.out.print("�������");
		}
		
	}

}
