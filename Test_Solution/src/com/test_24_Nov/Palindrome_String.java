package com.test_24_Nov;

import java.util.Scanner;

public class Palindrome_String {
	public void checkPalindrome(String s) {
		char ch[] = s.toCharArray();
		char ch1[] = new char[ch.length];
		int j=ch.length-1;
		for (int i = 0; i < ch.length; i++) {
			ch1[i] = ch[j];
			j--;
		}
		String str1 = new String(ch1);
		//System.out.println(str1);
		if (str1.equals(s))
			System.out.println(s + " is palindrome");
		else
			System.out.println(s + " is not palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check it is palindrome or not");
		String str = sc.next();
		Palindrome_String obj=new Palindrome_String();
		obj.checkPalindrome(str);

	}

}
