package com.Arrays;

import java.util.Scanner;
//2> find sum of all elements of array
public class Sum_Array {
	public static int[] createArray() {
		int num[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		num = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter " + (i + 1) + " Array Element ");
			num[i] = sc.nextInt();
		}
		return num;

	}

	public static void printArray(int a[]) {
		System.out.println("\nThe elements of array are:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static void sumArray(int a[]) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println("\nThe Sum of elements of array are:" + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = createArray();
		printArray(arr);
		sumArray(arr);

	}

}
