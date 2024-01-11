package com.aprilFinalWrittenTest2019;

/*
 * 2) How to remove  Characters from the first String which are present in the second String and add deleted Characters in the ArrayList.[1M]
e.g String1-> India is great nation.
string2-in
output-> da s great 
ArrayList [i,n,i,i,n,i]

 */
import java.util.ArrayList;
//import java.util.Arrays;

public class RemoveCharacterQ2 {

	public void removeCharacters(String s, String s1) {
		ArrayList<Character> l = new ArrayList<>();

		char ch1[] = s.toCharArray();
		// System.out.println(ch1.length);
		//char ch2[] = s1.toCharArray();
		// System.out.println(Arrays.toString(ch2));
		// System.out.println(ch2.length);

//		for (int i = 0; i < ch2.length; i++) {
//			for (int j = 0; j < ch1.length; j++) {
//				if (ch2[i] == ch1[j]) {
//					//l.add(ch1[j]);
//					ch1[j] = '#';
//				}
//
//			}
//		}
		for (int j = 0; j < ch1.length; j++) {
			if (ch1[j] == 'i' || ch1[j] == 'n') {
				l.add(ch1[j]);
				ch1[j] = '#';
			}

		}

		// System.out.println(Arrays.toString(ch1));
		System.out.println("ArrayList of Deleted Elements:");
		System.out.println(l);

		char ch3[] = new char[ch1.length - l.size()];
		// System.out.println(ch3.length);
		// System.out.println(l.size());
		int n = 0;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] == '#') {

			} else {
				ch3[n] = ch1[i];
				n++;
			}
		}
		// System.out.println(Arrays.toString(ch1));
		// System.out.println(Arrays.toString(ch3));
		System.out.println("String After Removing Characters:");
		String newstr = new String(ch3);
		System.out.println(newstr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "india is great nation";
		String str1 = "in";
		RemoveCharacterQ2 obj = new RemoveCharacterQ2();
		obj.removeCharacters(str, str1);

	}

}
