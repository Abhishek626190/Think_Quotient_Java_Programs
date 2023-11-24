package com.stringBuilder;

public class Ensure_Capacity_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("Abhishek");
		System.out.println(str.capacity());
		str.ensureCapacity(5);
		System.out.println(str.capacity());
 
	}

}
