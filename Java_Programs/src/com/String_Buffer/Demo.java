package com.String_Buffer;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Hello");
		StringBuffer str1 = new StringBuffer(" world");
		System.out.println(str.append(str1));
		System.out.println(str);
		System.out.println(str1);
		StringBuffer str2;
		str2 = new StringBuffer("Abhi");
		System.out.println(str2);
		String s = "Abhishek";
		StringBuffer s1 = new StringBuffer(s);
		System.out.println(s1);

	}

}
