package com.Assignements_Array_1D_H_W;

public class Find_Minimum_Char_Array {
	public static void find(char a[]) {
		char min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > min) {
				a[i] = min;
			}
			min = a[i];

		}
		System.out.println("'" + min + "'");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = { 'A', 'D', 'E', 'x', 'z', 'R' };
		find(ch);

	}

}
