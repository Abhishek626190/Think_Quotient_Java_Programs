package com.stringBuilder;

public class Append_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Abhi");
		System.out.println(str.length());
		str.append("shek");
		System.out.println(str);
		System.out.println(str.capacity());
		str.append(" you are looking so beautiful wow");
		System.out.println(str);
  		System.out.println(str.capacity());
		

	}

}
