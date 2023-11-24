package com.Test_Assignments_06_11_2023;

public class Q4_Copy_Array {
	public static void copy(int a[][]) {
		int arr[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			int k = a[i].length - 1;
			for (int j = 0; j < a[i].length; j++) {
				arr[i][j] = a[i][k];
				k--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ",");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		copy(arr);

	}

}
