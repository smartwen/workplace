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
		//入栈
		while(number!=0){
			stack.push(number%2);
			number/=2;
		}
		//出栈
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		int number = 0;
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个正整数");
		number=in.nextInt();
		Convert(number);
	}
}
