package com.Logical_Programs;

import java.util.*;
//reverse string using stringbuilder or stringbuffer
public class Reverse_String {
	public static void reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
	}
	//reverse string using i
	public static void performReverse(String s) {
		char ch[]=s.toCharArray();
		String store="";
		for(int i=ch.length-1;i>=0;i--)
		{
			store=store+ch[i];
		}
		System.out.println(store);
 		 
	}
	public String toString()
	{
		 return "Yes";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Reverse_String s=new Reverse_String();
		Scanner sc=new Scanner(System.in);
		//System.out.println(sc);
		System.out.println("Enter String To Reverse");
		String name=sc.next();
		//s.reverse(name);
		//reverse(name);
		performReverse(name);

	}

}
