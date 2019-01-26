package com.java.javaBasicStudy.webcto;

import java.util.Random;

public class DeskOfCard {
	Card card[];
	//��ʼ��
	public void init(){
	     String num[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	     String[] suit={"����","÷��","����","����"};
	     card=new Card[52];
	     for(int i=0;i<52;i++){
	    	 card[i]=new Card(num[i%13],suit[i/13]);
	     }
	}
	//Iϴ��
	public void shufflecard(){
		Random rd=new Random();
		for(int i=0;i<52;i++){
			int j=rd.nextInt(52); //���������
			Card temp=card[i];
			card[i]=card[j];
			card[j]=temp;
		}
	}
	
	//����
	
	public void dealcard(){
		for(int i=0;i<52;i++){
			if(i%4==0)
				System.out.println("\n");
			System.out.print(card[i]);
		}
	}
	

}
