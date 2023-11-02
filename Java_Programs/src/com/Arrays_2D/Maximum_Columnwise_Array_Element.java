package com.Arrays_2D;

public class Maximum_Columnwise_Array_Element {
	public static void minElement(int a[][]) {
		for (int i = 0; i < a[i].length; i++) {
			int max = a[0][i];
			for (int j = 0; j < a.length; j++) {
				if (a[j][i] < max) {
					a[j][i] = max;
				}
				max = a[j][i];
			}
			System.out.println(max);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 22, 9, 31 }, { 12, 25, 26 }, { 34, 42, 2}, { 5, 4, 3} };
		minElement(arr);

	}

}
