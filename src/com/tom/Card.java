package com.tom;

public class Card {
	int value;
	char [] f=new char[]{0x2663,0x2666,0x2665,0x2660};
	public Card(int value){
		this.value=value;
	}
	
	public String getCard(){
		return value%13+1+""+f[value/13];
	}

}
