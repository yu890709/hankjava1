package com.tom;

public class StringTester {

	public static void main(String[] args) {
		String s="Hello world";
		String s1="";
		System.out.println(s.substring(5));
		System.out.println(s.substring(3, 6));
		for(int i=0;i<s.length();i++){
			s1+=s.charAt(s.length()-1-i);
		}
		System.out.println(s1);
		
		
		String s2="Jack Tom Eric Tom";
		String name="Tom";
		String c="boss";
		
		for(int i=0;i<s2.length();i++){
			if(i==s2.indexOf(name)){
				System.out.print(c);
				continue;
			}
			if(i>s2.indexOf(name)&&i<s2.indexOf(name)+3)
				continue;
			System.out.print(s2.charAt(i));
		}
		
		
		System.out.println("\n"+s2.substring(0, s2.indexOf(name))+c
				+s2.substring(s2.indexOf(name)+name.length()));

		System.out.println(s2.replace(name, c));
		
		
		int a=Integer.parseInt("22");
		System.out.println(++a);		
		Integer x=11;
		System.out.println(x.toString()+a);
	}

}
