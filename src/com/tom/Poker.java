package com.tom;

import java.util.Random;

public class Poker {
	private Card []cards=new Card[52];
	
	public Poker(){
		for(int i=0;i<cards.length;i++)
			cards[i]=new Card(i);
	}
	public void shuffle(){
		Random rnd=new Random();
		for(int i=0;i<cards.length;i++){
			int r=rnd.nextInt(52);
			Card tmp=cards[r];
			cards[r]=cards[i];
			cards[i]=tmp;
		}
	}
	public void print(){
		for(int i=0;i<cards.length;i++){
			System.out.print(cards[i].getCard()+" ");
			if(i%13==12)
				System.out.println();
		}
	}
}
