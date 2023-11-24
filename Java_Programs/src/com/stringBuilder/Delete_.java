package com.stringBuilder;

public class Delete_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Abhishek");
		System.out.println(str.delete(4, 7));
		System.out.println(str.delete(4, str.length()));

	}

}
