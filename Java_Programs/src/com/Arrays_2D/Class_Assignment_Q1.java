package com.Arrays_2D;

import java.util.Scanner;

public class Class_Assignment_Q1 {
	public static int[][] acceptData() {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter " + (j + 1) + " element of " + (i + 1) + " Column");
				int ele = sc.nextInt();
				arr[i][j] = ele;
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = acceptData();
		Demo3.printArray(array);

	}

}
