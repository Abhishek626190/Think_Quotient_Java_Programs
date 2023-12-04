package com.Revise;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM";
		char ch[] = str.toCharArray();
		String str1;
		int j = 0;
		char ch1[] = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			ch1[j] = ch[i];
			j++;
		}
		str1 = new String(ch1);
		//System.out.println(str1);
		if (str.equals(str1)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not palindrome");

	}

}
