package com.string;

public class Reverse_Odd_String {
	public static void reverse(String s[]) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() % 2 == 0) {
				char ch[] = s[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j] + "");
				}
				System.out.print(",");
			} else
				System.out.print(s[i]+",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = { "Abhi", "Adarsh", "Suraj", "Abhishek", "Priti" };
		reverse(str);
	}

}
