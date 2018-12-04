package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Poker poker=new Poker();
		poker.shuffle();
		poker.print();
		System.out.println();
		
		
		
//		Random ran=new Random();
//		int cF=ran.nextInt(4);
//		int cN=ran.nextInt(13)+1;
//		char [] f=new char[]{0x2663,0x2666,0x2665,0x2660};
//		int []c=new int[13];
//		String[] cNum=new String[13];
//		System.out.println(cN+""+f[cF]);
//		for(int i=1;i<c.length+1;i++){
//			switch(i){
//			case 1:
//				cNum[i-1]="A";
//				break;
//			case 11:
//				cNum[i-1]="J";
//				break;
//			case 12:
//				cNum[i-1]="Q";
//				break;
//			case 13:
//				cNum[i-1]="K";
//				break;
//			default:
//				cNum[i-1]=""+i;
//			}
//		}
//		for(int i=0;i<f.length;i++){
//			for(int j=0;j<c.length;j++){
//				System.out.print( cNum[j]+""+f[i]+" ");
//			}
//			System.out.println();
//		}
	}

}
