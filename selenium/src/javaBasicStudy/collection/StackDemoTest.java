/**
 * 
 */
package com.javaBasicStudy.collection;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Administrator
 *2017-9-21
 */
public class StackDemoTest {
	public static void Convert(int number){
		Stack<Integer> stack=new Stack<Integer>();
		//��ջ
		while(number!=0){
			stack.push(number%2);
			number/=2;
		}
		//��ջ
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		int number = 0;
		Scanner in=new Scanner(System.in);
		System.out.println("������һ��������");
		number=in.nextInt();
		Convert(number);
	}
}
