package com.Arrays_2D;

public class Minimum__Columnwise_Array_Element {

	public static void minElement(int a[][]) {
		for (int i = 0; i < a[i].length; i++) {
			int min = a[0][i];
			for (int j = 0; j < a.length; j++) {
				if (a[j][i] > min) {
					a[j][i] = min;
				}
				min = a[j][i];
			}
			System.out.println(min);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 22, 9, 31 }, { 12, 25, 26 }, { 34, 42, 2 }, { 5, 4, 3 } };
		minElement(arr);

	}

}
