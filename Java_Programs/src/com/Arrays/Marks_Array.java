package com.Arrays;

import java.util.Scanner;
//7>create marks integer(out of 100)  array and find total,percentage and grade
public class Marks_Array {
	static int sum = 0;
	static float per = 0.0f;

	public static int[] createArray() {
		int num[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Subject");
		int size = sc.nextInt();
		num = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter " + (i + 1) + " Subject Marks ");
			num[i] = sc.nextInt();
		}
		sc.close();
		return num;

	}

	public static void sumMarks(int a[]) {

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
	}

	public static void calculatePercentage(int a[]) {
		per = (sum * 100) / (a.length * 100);
		System.out.println(per);
	}

	public static void printGrade(float p) {
		if (p >= 90)
			System.out.println("A");
		else if (p >= 80)
			System.out.println("B");
		else if (p >= 70)
			System.out.println("C");
		else if (p >= 60)
			System.out.println("D");
		else
			System.out.println("Fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = createArray();
		sumMarks(arr);
		calculatePercentage(arr);
		printGrade(per);
	}

}
