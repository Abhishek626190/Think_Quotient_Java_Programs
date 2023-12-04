package com.Logical_Programs;

//A word is alphabetically sorted if all of the 
//letters in it are in consecutive alphabetical order.
//Some examples of alphabetically sorted words: 
//abhors (a is before b, b is before h, h is before o, etc.), ghost, accent, hoop.
public class Alphabatically_Sorted {
	public static boolean check(String s) {
		// String str= "Paula has a French accent";
		boolean flag = true;
		String str[] = s.split(" ");
		// System.out.println(str.length);
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			char ch[] = str[i].toCharArray();
			// System.out.println(str[i].toString());
			count = 0;
			for (int j = 1; j < ch.length; j++) {

				if (Character.toUpperCase(ch[0]) < Character.toUpperCase(ch[j])) {
					count++;
				} else
					break;

				// System.out.println("Count:" + count);
			}
			if ((count + 1) == ch.length && (count + 1) > 2) {
				flag = true;
				break;
			} else
				flag = false;
		}
		// System.out.println(flag);
		return flag;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Paula has a French accent";
		boolean flag = check(str);
		System.out.println(flag);
		String str1 = "The biopsy returned negative results";
		boolean flag1 = check(str1);
		System.out.println(flag1);
		String str2 = "She sells sea shells by the sea shore";
		boolean flag2 = check(str2);
		System.out.println(flag2);
	}

}
