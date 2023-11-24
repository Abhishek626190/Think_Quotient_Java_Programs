package com.string;

import java.util.Arrays;

public class Reverse_Odd_String1 {
	public static void reverse(String s[]) {
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() % 2 != 0) {
				char ch[] = s[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) {
					System.out.print(ch[j] + "");
				}
				System.out.print(" ");
			} else
				System.out.print(s[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Make sure uoy only esrever sdrow of ddo length");
		String strarr[] = str.split(" ");
		// System.out.println(Arrays.toString(strarr));
		reverse(strarr);

	}

}
