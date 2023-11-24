package com.String_Buffer;

public class Replace_SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("Abhishek");
		str.replace(0,  str.length(), "Abhi");
		System.out.println(str);
		str.replace(0, str.length(), "Abhishek");
		System.out.println(str);
		

	}

}
