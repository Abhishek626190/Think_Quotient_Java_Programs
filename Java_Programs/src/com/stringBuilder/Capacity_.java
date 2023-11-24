package com.stringBuilder;

public class Capacity_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Abhi");
		int cap=str.capacity();
		System.out.println(cap);
		StringBuilder str1=new StringBuilder();
		System.out.println(str1.capacity());
		str1.append("Abhishek is a good boy and also naughty boy");
		System.out.println(str1.capacity());
		StringBuilder str2=new StringBuilder("Oh my god you are looking so gorgeus");
		int c=str2.capacity();
		System.out.println(c);
 
	}

}
