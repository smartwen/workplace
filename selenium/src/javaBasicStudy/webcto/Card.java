package com.java.javaBasicStudy.webcto;

import java.util.Random;

public class Card {
	public String num;
	public String suit;
	Card(String num,String suit){
		this.num=num;
		this.suit=suit;
	}
	public String toString(){
		String ss=suit+":"+num+" ";
		return ss;
	}
}

	
