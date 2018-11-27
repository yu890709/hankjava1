package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Random ran=new Random();
		int cF=ran.nextInt(4);
		int cN=ran.nextInt(13)+1;
		String [] f=new String[]{"S","H","D","C"};
		System.out.println(cN+""+f[cF]);

	}

}
