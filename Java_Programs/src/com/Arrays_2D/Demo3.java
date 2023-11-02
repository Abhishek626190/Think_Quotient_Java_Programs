package com.Arrays_2D;

import java.util.Scanner;

public class Demo3 {
	public static int[][] createArray2D() {
		int arr[][];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int row = sc.nextInt();
		arr = new int[row][];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter size of " + (i + 1 )+ "column");
			int col = sc.nextInt();
			arr[i] =new int[col];
			for (int j = 0; j <arr[i].length; j++) {
				System.out.println("Enter " + (j + 1) + " Element");
				int ele = sc.nextInt();
				arr[i][j] = ele;
			}
		}
		return arr;

	}

	public static void printArray(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[][] = createArray2D();
		printArray(array);

	}

}
