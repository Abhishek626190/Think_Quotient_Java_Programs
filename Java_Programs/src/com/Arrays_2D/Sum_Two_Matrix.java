package com.Arrays_2D;

public class Sum_Two_Matrix {
	int c[][];

	public int[][] sumMatrix(int a[][], int b[][]) {

		for (int i = 0; i < a.length; i++) {
			c = new int[a.length][a[i].length];
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

		return c;
	}

	public void printSum(int sum[][]) {
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void printSum1( ) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_Two_Matrix obj = new Sum_Two_Matrix();
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int arr1[][] = { { 7, 8, 9 }, { 10, 11, 12 } };

		int sumArr[][] = obj.sumMatrix(arr, arr1);
		//obj.printSum(sumArr);
		//obj.printSum1();

	}

}
