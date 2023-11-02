package com.Arrays_2D;

import java.util.Scanner;

public class Class_Assignment_Q2 {
	public static int[][] createArray() {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Size of Column of" + (i + 1) + "Row");
			int size = sc.nextInt();
			arr[i] = new int[size];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter " + (j + 1) + " element");
				int ele = sc.nextInt();
				arr[i][j] = ele;
			}
 		}
		return arr;
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]=createArray();
		Demo3.printArray(array);

	}

}
