package com.Arrays_2D;

public class Sum_Diagonal_Array_Element {
	public static void sumDiagonal(int a[][]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j == i) {
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println(sum);
	}

	public static void sumDiagonal1(int a[][]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = a[i].length - 1; j >= 0; j--) {

				sum = sum + a[i][j];
				i++;

			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 22, 9, 31 }, { 12, 25, 26 }, { 34, 42, 2 } };
		sumDiagonal(arr);
		sumDiagonal1(arr);

	}

}
