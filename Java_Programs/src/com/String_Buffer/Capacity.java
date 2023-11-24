package com.String_Buffer;

public class Capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("Hello");
		StringBuffer str1=new StringBuffer();
		str1.append("Hello");
 		StringBuffer str2=new StringBuffer("I am a very not naughty boy");
		System.out.println(str.capacity());
		System.out.println(str1.capacity());
		System.out.println(str2.capacity());
 

	}

}
