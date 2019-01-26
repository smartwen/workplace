package com.java.javaBasicStudy.webcto;

import java.util.ArrayList;

public class PokerDemo {
	private  static String[] roles={"黑桃","红心","方片","梅花"};
	private static String[][] hands=new String [4][];  //每个玩家手中的牌
	private static ArrayList<String> pokers=new ArrayList<String>();//52张牌
	
	public static void init(){
		for(String role:roles){
			for(int i=1;i<=13;i++){
				
				String s=i+"";
				switch(i){
				case 1:
					s="A";
					break;
				case 11:
					s="J";
					break;
				case 12:
					s="Q";
					break;
				case 13:
					s="K";
					break;
				}
				
				pokers.add(role+""+i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		PokerDemo.init();
		for(String s:pokers){
			System.out.print(s+ " ");
		}
	}
}
	