package com.Assignments_Array;

import java.util.Scanner;

public class Average_Overload {
	public static double[] createArray() {
		double num[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = sc.nextInt();
		num = new double[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter " + (i + 1) + " Array Element ");
			num[i] = sc.nextInt();
		}
		return num;

	}

	public static void printArray(double a[]) {
		System.out.println("\nThe elements of array are:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println("\n*****************");
	}

	public static int average(int a[]) {
		int sum = 0;
		int avg;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		avg = sum / a.length;
		// System.out.println(avg);
		return avg;
	}

	public static double average(double a[]) {
		double sum = 0;
		double avg;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		avg = sum / a.length;
		// System.out.println(avg);
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = Sum_Array.createArray();
		average(arr);
		Sum_Array.printArray(arr);
		double arr1[] = createArray();
		average(arr1);
		printArray(arr1);

	}

}
