package com.java.javaBasicStudy.webcto;
import com.java.javaBasicStudy.webcto.DeskOfCard;
public class TestCard {
	public static void main(String[] args) {
		DeskOfCard cc=new DeskOfCard();
		cc.init();
		cc.shufflecard();
		cc.dealcard();
	}
}
