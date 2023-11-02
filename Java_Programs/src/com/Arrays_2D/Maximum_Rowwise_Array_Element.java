package com.Arrays_2D;

public class Maximum_Rowwise_Array_Element {
	public static void findMax(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int max = 0;
			for (int j = i + 1; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 22, 9, 31 }, { 12, 25, 26 } };
 		findMax(arr);

	}

}
