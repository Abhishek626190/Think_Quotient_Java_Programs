package com.Arrays_2D;

public class Sum_Each_Row_Column {
	public static void sumRowArr(int a[][]) {
		System.out.println("The sum of Rows element is:");
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = 0; j < a[i].length; j++) {
				sum = a[i][j] + sum;
			}
			System.out.print(sum + ",");
		}
	}

	public static void sumColumnArr(int a[][])

	{
		System.out.println("\n****************");
		System.out.println("The sum of Columns element is:");

		for (int i = 0; i < a[i].length; i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum = a[j][i] + sum;
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 22, 9, 31 }, { 12, 25, 26 }, { 34, 42, 2 }, { 5, 4, 3 } };
		sumRowArr(arr);
		sumColumnArr(arr);
	}

}
