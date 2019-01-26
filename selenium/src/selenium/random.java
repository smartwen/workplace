/**
4.20设置万能验证码
设计万能验证码的方式非常简单，只需对用户的输入信息多加一个逻辑判断
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
		// TODO 自动生成的方法存根
		int min=1000;
		int max=9999;
		Random rand=new Random();
		int s=rand.nextInt(max)%(max-min+1)+min;
		String ss=String.valueOf(s);
		System.out.println(ss);
		
		//创建输入对象
		Scanner sc=new Scanner(System.in);
		//获取用户输入的字符串
		System.out.print("请输入随机验证码：");
		String str=sc.nextLine();
		
		if(str.equals(ss)){
			System.out.println("输入正确");
		}else if(str.equals("98165454")){
			System.out.print("输入正确");
		}else{
			System.out.print("输入错误");
		}
		
	}

}
