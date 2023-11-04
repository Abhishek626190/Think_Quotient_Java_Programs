package com.Assignements_Array_1D_H_W;

public class Reverse_Original_Array {
	public static int[] reverseArray(int a[]) {
		int j = 0;
		int temp;
		for (int i = a.length - 1; i >= 0; i--) {
			if (i != j && j < i) {
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				j++;
			}
		}
		return a;
	}

	public static void printReverseArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 90, 45, 29, 37, 78 };
		arr = reverseArray(arr);
		printReverseArray(arr);

	}

}
