package com.Arrays_1D;

//9>find all the elements of array which are less than its avg.
public class Less_Average_Array {
	static float avg = 0.0f;

	public static void check(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < avg) {
				System.out.println(a[i] + ",");
			}
		}
	}

	public static void average(int a[]) {
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		avg = sum / a.length;
		// System.out.println(avg);
		 

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = Sum_Array.createArray();
		average(arr);
		check(arr);

	}

}
