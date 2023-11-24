package com.Test_Assignments_06_11_2023;

public class Q5_Find_Max {
	public static void max(int a[][]) {

		for (int i = 0; i < a.length; i++) {
			int max = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
			System.out.println("Maximum element in row: " + i + " is: " + max);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };
		max(arr);

	}

}
