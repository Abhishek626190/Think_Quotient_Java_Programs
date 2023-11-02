package com.Arrays_1D;

import java.util.Scanner;

public class Demo2 {
	public static int[] createArray() {
		int num[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		num = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter " + (i + 1) + " array Element");
			num[i] = sc.nextInt();
		}
		sc.close();
		return num;
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = createArray();
		printArray(arr);

	}

}
